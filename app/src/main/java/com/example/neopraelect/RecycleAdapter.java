package com.example.neopraelect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.CourseViewHolder> {
    private LinkedList<Course> courseList;
    private RecyclerViewClickListener listener;

    public RecycleAdapter(LinkedList<Course> courseList, RecyclerViewClickListener listener) {
        this.courseList = courseList;
        this.listener = listener;
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView courseCode;
        private TextView courseTitle;
        private TextView profName;

        public CourseViewHolder(final View view) {
            super(view);
            courseCode = view.findViewById(R.id.courseCode);
            courseTitle = view.findViewById(R.id.courseTitle);
            profName = view.findViewById(R.id.profName);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }

    @NonNull
    @Override
    public RecycleAdapter.CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_card, parent, false);
        return new CourseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final CourseViewHolder holder, final int position) {
        String courseCode = "CSC " + courseList.get(position).getCode();
        String courseTitle = courseList.get(position).getTitle();
        String profName = courseList.get(position).getProfessor().getInstructor();

        holder.courseCode.setText(courseCode);
        holder.courseTitle.setText(courseTitle);
        holder.profName.setText(profName);
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    public interface RecyclerViewClickListener {
        void onClick(View v, int position);
    }
}
