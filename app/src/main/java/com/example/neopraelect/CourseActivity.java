package com.example.neopraelect;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class CourseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    RecycleAdapter adapter;
    RecyclerView recyclerView;
    ClickListen listen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        ArrayList<Course> courseList;
        courseList = input();
        // TextReader read = new TextReader();
        // courseList = read.reader("CS Department Office Hours.csv").getCourseList();

        recyclerView = findViewById(R.id.recyclerView);
        listen = new ClickListen() {
            @Override
            public void click(int index) {
                // TODO: go to next page with info
            }
        };

        adapter = new RecycleAdapter(courseList, getApplication(), listen);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(CourseActivity.this));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // TODO: check if navigation item is selected or not
        return false;
    }

    private ArrayList<Course> input() {
        ArrayList<Course> list = new ArrayList<>();
        list.add(new Course(171, "Intro to CS", new Professor("Purtee", "Weg101", "Monday")));
        list.add(new Course(172, "Algorithms", new Professor("Pawlicki", "Weg102", "Tuesday")));
        return list;
    }
}

