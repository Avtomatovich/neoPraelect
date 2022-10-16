package com.example.neopraelect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Department {
    private LinkedList<Course> courseList;

    public void setCourse(Course course) {
        courseList.add(course);
    }

    public Course getCourse(int i) {
        return courseList.get(i);
    }

    public int getSize() {
        return courseList.size();
    }

    public LinkedList<Course> getCourseList() {
        return courseList;
    }
}
