package com.example.view.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.view.R;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    TextView tvName;

    ImageView image;

    TextView tvRate;
    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tvName);
        image = itemView.findViewById(R.id.image);
        tvRate = itemView.findViewById(R.id.tvRate);
    }
}
