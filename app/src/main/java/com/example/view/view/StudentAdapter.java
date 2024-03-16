package com.example.view.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.view.R;
import com.example.view.model.StudentPojo;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    ArrayList<StudentPojo> students;

    public StudentAdapter(ArrayList<StudentPojo> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        final StudentPojo lists = students.get(position);

        holder.image.setImageResource(lists.photo);
        holder.tvName.setText(lists.name);
        holder.tvRate.setText(lists.rate);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
