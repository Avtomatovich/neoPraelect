package com.example.neopraelect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<CourseViewHolder> {
    private final ArrayList<Course> courseList;
    private Context context;
    private ClickListen listen;

    public RecycleAdapter(ArrayList<Course> courseList, Context context, ClickListen listen) {
        this.courseList = courseList;
        this.context = context;
        this.listen = listen;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_card, parent, false);
        return new CourseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final CourseViewHolder holder, final int position) {
        final int index = holder.getAdapterPosition();
        String courseCode = "CSC " + courseList.get(position).getCode();
        String courseTitle = courseList.get(position).getTitle();
        String profName = courseList.get(position).getProfessor().getInstructor();

        holder.courseCode.setText(courseCode);
        holder.courseTitle.setText(courseTitle);
        holder.profName.setText(profName);
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listen.click(index);
            }
        });
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
