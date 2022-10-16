package com.example.neopraelect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class CoursesActivity extends AppCompatActivity {
    private ArrayList<Course> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        courseList = new ArrayList<>();

        setUserInfo();
        setAdapter();
    }

    private void setAdapter() {
        RecycleAdapter adapter = new RecycleAdapter(courseList);
    }

    private void setUserInfo() {
        TextReader read = new TextReader();
        courseList = read.reader("CS Department Office Hours.csv").getCourseList();
    }
}

