package com.example.neopraelect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {
    private final ArrayList<Course> coursesList;

    public RecycleAdapter(ArrayList<Course> coursesList) {
        this.coursesList = coursesList;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView courseCode;
        private TextView courseTitle;
        private TextView profName;

        public MyViewHolder(final View view) {
            super(view);
            courseCode = view.findViewById(R.id.courseCode);
            courseTitle = view.findViewById(R.id.courseTitle);
            profName = view.findViewById(R.id.profName);
        }
    }

    @NonNull
    @Override
    public RecycleAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_courses, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.MyViewHolder holder, int position) {
        String courseCode = "CSC " + coursesList.get(position).getCode();
        String courseTitle = coursesList.get(position).getTitle();
        String profName = coursesList.get(position).getProfessor().getInstructor();

        holder.courseCode.setText(courseCode);
        holder.courseTitle.setText(courseTitle);
        holder.profName.setText(profName);
    }

    @Override
    public int getItemCount() {
        return coursesList.size();
    }
}
