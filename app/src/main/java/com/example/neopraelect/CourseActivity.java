package com.example.neopraelect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.LinkedList;

public class CourseActivity extends AppCompatActivity {
    private LinkedList<Course> courseList;
    private RecyclerView recyclerView;
    private RecycleAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        recyclerView = findViewById(R.id.recyclerView);
        courseList = input();
        // TextReader read = new TextReader();
        // courseList = read.reader("C:\\file.txt").getCourseList();

        setAdapter();
    }

    private void setOnClickListener() {
        listener = new RecycleAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                System.out.println("Click me harder!");
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.putExtra("professor", courseList.get(position).getProfessor().getProfArray());
                startActivity(intent);
            }
        };
    }

    private void setAdapter() {
        setOnClickListener();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new RecycleAdapter(courseList, listener));
    }

    private LinkedList<Course> input() {
        LinkedList<Course> list = new LinkedList<>();

        list.add(new Course(131, "Recreational Graphics", new Professor("Thaddeus Pawlicki", "Wegmans Hall 2101, https://rochester.zoom.us/j/98833017650", "TWR 1:00-2:00")));
        list.add(new Course(172, "Data Structures & Algorithms", new Professor("Thaddeus Pawlicki", "Wegmans Hall 2101, https://rochester.zoom.us/j/98833017650", "TWR 1:00-2:00")));
        list.add(new Course(161, "Introduction to Programming", new Professor("Andrew Read-McFarland", "Wegmans Hall 2105", "W 2:30 PM-3:30 PM, F 1:30 PM-3:30 PM")));
        list.add(new Course(170, "Introduction to Web Development", new Professor("Andrew Read-McFarland", "Wegmans Hall 2105", "W 2:30 PM-3:30 PM, F 1:30 PM-3:30 PM")));
        list.add(new Course(214, "Mobile App Development", new Professor("Arthur Roolfs", "NA", "NA")));
        list.add(new Course(227, "Intro to Dip using Python", new Professor("Marvin Doyley", "Appt", "m.doyley@rochester.edu")));
        list.add(new Course(229, "Computer Models of Perception & Cognition", new Professor("Robert Jacobs", "Appt", "rjacobs@ur.rochester.edu")));
        list.add(new Course(241, "Intro to Computational Neuroscience", new Professor("Ralf Haefner", "Appt", "rhaefne2@ur.rochester.edu")));
        list.add(new Course(171, "Introduction to Computer Science", new Professor("Adam Purtee", "Wegmans Hall 2109", "MW 2:00-3:00, R 3:30-4:30")));
        list.add(new Course(246, "Machine Learning", new Professor("Adam Purtee", "Wegmans Hall 2109", "MW 2:00-3:00, R 3:30-4:30")));
         list.add(new Course(257, "Computer Networks", new Professor("Adam Purtee", "Wegmans Hall 2109", "MW 2:00-3:00, R 3:30-4:30")));
        list.add(new Course(173, "Computation & Formal Systems", new Professor("George Ferguson", "Wegmans Hall 2103", "T 1:00-2:00, W 3:30-4:30")));
        list.add(new Course(242, "Introduction to Artificial Intelligence", new Professor("George Ferguson", "Wegmans Hall 2103", "T 1:00-2:00, W 3:30-4:30")));
        list.add(new Course(212, "Human-Computer Interaction", new Professor("Ehsan Hoque", "Wegmans Hall 3103", "MW 12:00-1:00")));
        list.add(new Course(216, "AR/VR Interaction Design", new Professor("Zhen Bai", "Wegmans Hall 3007", "T 5:00-6:00")));
        list.add(new Course(244, "Knowledge Representation & Reasoning in AI", new Professor("Lenhart Schubert", "Wegmans Hall 3003", "TR 5:00-6:00")));
        list.add(new Course(248, "Statistical Speech & Language Processing", new Professor("Daniel Gildea", "Wegmans Hall 2215", "MW 2:00-3:00")));
        list.add(new Course(252, "Computer Organization", new Professor("Sreepathi Pai", "Wegmans Hall 3409", "MW 4:40-5:40")));

        list.add(new Course(282,"Data & Analysis of Efficient Algorithms",new Professor("Daniel Stefankovic","Wegmans Hall 2315","TR 12:30PM-1:45PM")));
        list.add(new Course(281,"Introduction to Cryptography",new Professor("Eustrat Zhupa","Wegmans Hall 2107","M 1:30-2:30, F 6:00-7:00")));
        list.add(new Course(261,"Database Systems",new Professor("Eustrat Zhupa","Wegmans Hall 2107","M 1:30-2:30, F 6:00-7:00")));
        list.add(new Course(264,"Computer Audition",new Professor("Zhiyao Duan","Computer Studies Building 720","W 2:30-3:30")));
        list.add(new Course(256,"Operating Systems",new Professor("John Criswell","Computer Studies Building 717","W 3:00-4:00")));
        list.add(new Course(262,"Computational Introduction to Statistics",new Professor("Aruni Jayathilaka","aruni.jayathilaka@rochester.edu","Appt")));
        list.add(new Course(254,"Programming Language Design & Implementation",new Professor("Michael Scott","miscott@acm.org","Appt")));
        list.add(new Course(253,"Collaborative Programming and Software Design",new Professor("Chen Ding","Wegmans Hall 3407","F 11:00-12:00")));
        list.add(new Course(240,"Data Mining",new Professor("Cantay Caliskan","NA","NA")));
        list.add(new Course(227,"Intro to Dip in Python",new Professor("Marvin Doyley","NA","NA")));
        list.add(new Course(299,"Social Implications of Computing",new Professor("Joseph Loporcaro","NA","NA")));
        list.add(new Course(273,"Writing in Computer Science",new Professor("Joseph Loporcaro","NA","NA")));
        list.add(new Course(298,"Deep Learning",new Professor("Chenliang Xu","Wegmans Hall 3003","T 11:00-12:00")));
        list.add(new Course(292,"Mobile Visual Computing",new Professor("Yuhao Zhu","yzhu@rochester.edu","Appt")));
        list.add(new Course(288,"Analytic Methods in Computer Science",new Professor("Kaave Hosseini","Wegmans Hall 2507","W 4:50-6:00")));
        list.add(new Course(280,"Computer Models & Limitations",new Professor("Kaave Hosseini","Wegmans Hall 2507","TR 12:30PM-1:45PM")));
        list.add(new Course(284,"Advanced Algorithms",new Professor("Daniel Stefankovic","Wegmans Hall 2107","M 1:30-2:30, F 6:00-7:00")));

        return list;
    }
}
