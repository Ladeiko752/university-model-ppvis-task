package com.company.Description;

import java.util.ArrayList;

public interface GroupDescription {
    String getGroupNumber();
    String getFaculty();

    ArrayList<StudentDescription> getStudents();
}
