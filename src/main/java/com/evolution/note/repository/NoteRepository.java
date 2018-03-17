package com.evolution.note.repository;

import com.evolution.note.model.Note;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NoteRepository {
    // 목록 조회
    public List<Note> getNotes() {
        return null;
    }

    // 개별 조회
    public Note getNote(long noteNo) {
        return null; //noteRepository.getNote(noteNo);
    }

    // 개별 수정
    public int updateNote(Note note) {
        return 0; //noteRepository.updateNote(note);
    }

    // 개별 삭제
    public int deleteNote(long noteNo) {
        return 0; // noteRepository.deleteNo(noteNo);
    }
}
