package com.evolution.note.controller;

import com.evolution.note.model.Note;
import com.evolution.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;

    // 목록 조회
    @RequestMapping(value = "/notes", method = RequestMethod.GET)
    public String getNotes(ModelMap map) {
        List<Note> notes = noteService.getAllNotes();

        map.addAttribute("notes", notes);
        map.addAttribute("size", notes.size());

        return "note";
    }

    // 개별 조회
    @RequestMapping(value = "/notes/{noteNo}", method = RequestMethod.GET)
    public String getNote(@PathVariable(value="noteNo") long noteNo, ModelMap map) {
        Note note = noteService.getNote(noteNo);
        map.addAttribute("note", note);

        return "contents";
    }

    // 개별 등록
    @RequestMapping(value = "/addNotes", method = RequestMethod.POST)
    public String addNote(HttpServletRequest httpServletRequest, ModelMap map) {

        String title = httpServletRequest.getParameter("title");
        String contents = httpServletRequest.getParameter("contents");

        Note note = new Note();
        note.setTitle(title);
        note.setContents(contents);

        HttpSession httpSession = httpServletRequest.getSession();
        String id = (String)httpSession.getAttribute("userId");
        note.setUserId(id);

        int result = noteService.addNote(note);

        if (result > 0) {
            return "redirect:/notes";
        }
        return "add";
    }

    // 개별 등록 화면 이동
    @RequestMapping(value = "/view/add", method = RequestMethod.GET)
    public String addNote() {
        return "add";
    }

    // 개별 수정 화면 이동
    @RequestMapping(value = "/view/edit/{noteNo}", method = RequestMethod.GET)
    public String editNote(@PathVariable(value="noteNo") long noteNo, ModelMap map) {
        Note note = noteService.getNote(noteNo); // TODO. 그대로 '조회 화면의 모델을 가져오는게 좋음 수정해야함
        map.addAttribute("note", note);
        return "edit";
    }

    // 개별 수정
    @RequestMapping(value = "/notes/edit/{noteNo}", method = RequestMethod.POST)
    public String updateNote(Note note, HttpServletRequest httpServletRequest) {
        if (isEditable(httpServletRequest, note.getNoteNo())) { // TODO. note 정보에서 userId가 변함이 없다면 바로 써도 되지 않을까
            int result = noteService.updateNote(note);

            if (result > 0) {
                return "redirect:/notes/" + note.getNoteNo();
            }
        }

        return "contents";
    }

    // 개별 삭제
    @RequestMapping(value = "/notes/delete/{noteNo}", method = RequestMethod.GET)
    public String deleteNote(@PathVariable(value="noteNo") long noteNo, HttpServletRequest httpServletRequest) {
        if (isEditable(httpServletRequest, noteNo)) {
            int result = noteService.deleteNote(noteNo);

            if (result > 0) {
                return "redirect:/notes";
            }
        }
        return "contents";
    }

    private boolean isEditable(HttpServletRequest httpServletRequest, long noteNo) {
        HttpSession httpSession = httpServletRequest.getSession();
        String id = (String)httpSession.getAttribute("userId");
        Note note = noteService.getNote(noteNo);

        return id.equals(note.getUserId());
    }
}
