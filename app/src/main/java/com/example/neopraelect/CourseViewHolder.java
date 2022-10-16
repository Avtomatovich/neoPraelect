package com.example.neopraelect;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class CourseViewHolder extends RecyclerView.ViewHolder {
    TextView courseCode;
    TextView courseTitle;
    TextView profName;
    View view;

    public CourseViewHolder(View itemView) {
        super(itemView);
        courseCode = itemView.findViewById(R.id.courseCode);
        courseTitle = itemView.findViewById(R.id.courseTitle);
        profName = itemView.findViewById(R.id.profName);
        view = itemView;
    }
}
