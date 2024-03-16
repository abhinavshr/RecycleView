package com.example.view.model;

import java.util.ArrayList;
import java.util.List;

public class StudentPojo {

    public final int photo;
    public final String name;
    public final String rate;

    public StudentPojo(int photo, String name, String rate){
        this.name = name;
        this.photo = photo;
        this.rate = rate;
    }

}
