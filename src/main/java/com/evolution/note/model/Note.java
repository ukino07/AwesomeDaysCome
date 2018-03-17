package com.evolution.note.model;

import java.time.LocalDateTime;

public class Note {
    private long noteNo;
    private String userId;
    private LocalDateTime updateAt;
    private String title;
    private String contents;

    public long getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(long noteNo) {
        this.noteNo = noteNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
