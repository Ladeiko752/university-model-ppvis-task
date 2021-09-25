package com.company.Description;

import java.util.ArrayList;

public interface GroupDescription {
    int getGroupNumber();
    String getFaculty();
    String getSpeciality();
    ArrayList<StudentDescription> getStudents();
}
