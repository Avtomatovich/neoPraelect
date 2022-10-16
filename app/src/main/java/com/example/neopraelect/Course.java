package com.example.neopraelect;

import androidx.annotation.NonNull;

public class Course {
    private int code;
    private String title;
    private Professor professor;


    public Course(int code, String title, Professor professor) {
        this.code = code;
        this.title = title;
        this.professor = professor;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public Professor getProfessor() {
        return professor;
    }

    @NonNull
    @Override
    public String toString() {
        return code + " " + title + " " + professor.toString();
    }
}
