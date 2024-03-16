package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.view.model.StudentPojo;
import com.example.view.view.StudentAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvStudent);
        StudentAdapter adapter = new StudentAdapter(getStudents());
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
//        manager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
    }

    public ArrayList<StudentPojo> getStudents() {
        ArrayList<StudentPojo> students = new ArrayList<StudentPojo>();
        students.add(new StudentPojo(R.drawable.gmail, "Gmail", "4.9"));
        students.add(new StudentPojo(R.drawable.drive, "Drive", "4.5"));
        students.add(new StudentPojo(R.drawable.keep, "Google Keep", "4.0"));
        students.add(new StudentPojo(R.drawable.inbox, "Inbox", "4.8"));
        students.add(new StudentPojo(R.drawable.plus, "Google Plus", "4.2"));
        return students;
    }
}