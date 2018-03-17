package com.evolution.note.service;

import com.evolution.note.model.Note;
import com.evolution.note.model.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteMapper noteMapper;

    // 전체 목록 조회
    public List<Note> getAllNotes() {
        return noteMapper.getAllNotes();
    }

    // 목록 조회
    public List<Note> getNotes(String userId) {
        return noteMapper.getNotes(userId);
    }

    // 개별 조회
    public Note getNote(long noteNo) {
        return noteMapper.getNote(noteNo);
    }

    // 개별 등록
    public int addNote(Note note) {
        return noteMapper.addNote(note);
    }

    // 개별 수정
    public int updateNote(Note note) {
        return noteMapper.updateNote(note);
    }

    // 개별 삭제
    public int deleteNote(long noteNo) {
        return noteMapper.deleteNote(noteNo);
    }
}
