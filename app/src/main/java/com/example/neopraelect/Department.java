package com.example.neopraelect;

import java.util.ArrayList;
import java.util.LinkedList;

public class Department {
    private ArrayList<Course> courseList;

    public void setCourse(Course course) {
        courseList.add(course);
    }

    public Course getCourse(int i) {
        return courseList.get(i);
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
}
