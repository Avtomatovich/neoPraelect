package com.example.neopraelect;

import java.util.LinkedList;

public class Department {
    private LinkedList<Course> courseList;

    public void setCourse(Course course) {
        courseList.add(course);
    }

    public Course getCourse(int i) {
        return courseList.get(i);
    }

    public LinkedList<Course> getCourseList() {
        return courseList;
    }
}
