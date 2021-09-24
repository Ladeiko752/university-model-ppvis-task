package com.company.Description;

import java.util.ArrayList;

public interface DeanDescription {
    ArrayList<StudentDescription> getStudents();
    ArrayList<TeacherDescription> getTeachers();
    void expelStudent();
    void fireTeachers();
}
