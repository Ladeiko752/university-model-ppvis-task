package com.company.Model;

import com.company.Description.DeanDescription;
import com.company.Description.TeacherDescription;
import com.company.Description.TeachingDescription;

import java.util.ArrayList;

public class TeachingModel implements TeachingDescription {
    private ArrayList<TeacherDescription> teachers;
    private ArrayList<DeanDescription> dean;

    public TeachingModel() {
        this.teachers = new ArrayList<>();
        this.dean = new ArrayList<>();
    }

    @Override
    public ArrayList<TeacherDescription> getTeachers() {
        return teachers;
    }

    @Override
    public ArrayList<DeanDescription> getDean() {
        return dean;
    }
}
