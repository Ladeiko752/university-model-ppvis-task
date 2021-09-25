package com.company.Exam;

import com.company.Description.StudentDescription;

import java.util.ArrayList;

public class DuplicateCheck {

    public boolean checkDuplicate(ArrayList<StudentDescription> students, String name) throws Exception {
        for (StudentDescription student: students){
            if (student.getFullName().equals(name)){
                throw new Exception("Обнаружен дубликат!");
            }
        }
        return false;
    }
}
