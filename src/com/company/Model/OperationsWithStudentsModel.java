package com.company.Model;

import com.company.Description.GroupDescription;
import com.company.Description.OperationsWithStudentsDescription;
import com.company.Description.StudentDescription;

public class OperationsWithStudentsModel implements OperationsWithStudentsDescription {

    public void addStudent(StudentDescription student, GroupDescription groups) throws Exception {
        if (student != null && groups != null) {
            if (groups.getGroupNumber() == student.getGroupNumber()) {
                groups.getStudents().add(student);
            }else System.out.println(student.getFullName() + " не может быть студентом данной группы\n");
        }
        else throw new Exception("Не создан студент или группа");
    }

    @Override
    public void expelStudent(GroupDescription groups, String name) throws Exception {
        if(groups != null) {
            groups.getStudents().removeIf(student -> student.getFullName().equals(name));
        }else throw new Exception("Не создана группа");
    }

    @Override
    public String showGroup(GroupModel group) {
       return group.toString();
    }
}
