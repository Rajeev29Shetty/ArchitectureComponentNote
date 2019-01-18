package com.example.rajeev.architecturecomponentexample.database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "notes")
public class NoteEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String text;
    private Date date;

    @Ignore
    public NoteEntity() {
    }

    public NoteEntity(int id,  Date date, String text) {
        this.id = id;
        this.text = text;
        this.date = date;
    }

    @Ignore
    public NoteEntity( Date date, String text) {
        this.text = text;
        this.date = date;
    }

    @Override
    public String toString() {
        return "NoteEntity{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}



