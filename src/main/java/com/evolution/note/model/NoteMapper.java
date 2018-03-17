package com.evolution.note.model;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NoteMapper {

    public List<Note> getAllNotes();

    List<Note> getNotes(String userId);

    Note getNote(long noteNo);

    int addNote(Note note);

    int updateNote(Note note);

    int deleteNote(long noteNo);
}
