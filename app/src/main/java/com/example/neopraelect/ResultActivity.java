package com.example.neopraelect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView professorName = findViewById(R.id.professorName);
        TextView officeHours = findViewById(R.id.officeHours);
        TextView locations = findViewById(R.id.locations);

        String[] info = new String[3];

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            info = extras.getStringArray("professor");
        }

        professorName.setText(info[0]);
        officeHours.setText(info[1]);
        locations.setText(info[2]);
    }
}