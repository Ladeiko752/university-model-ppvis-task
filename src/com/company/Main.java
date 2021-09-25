package com.company;

import com.company.Model.DeanModel;
import com.company.Model.GroupModel;
import com.company.Model.StudentModel;
import com.company.Model.TeacherModel;

public class Main {

    public static void main(String[] args) throws Exception {
        StudentModel student1 = new StudentModel("Anton Ladeiko", "+375333134648", 921702, 3, true);
        StudentModel student2 = new StudentModel("Anton klintsov", "+375333135512", 921702, 3, true);
        StudentModel student3 = new StudentModel("Daniil Brovar", "+375331234567", 921702, 3, true);

        StudentModel student11 = new StudentModel("Andrei Zharikov", "+375445342144", 921701, 3, true);
        StudentModel student22 = new StudentModel("Nikita Rusak", "+375333215423", 921701, 3, true);



        GroupModel group921702 = new GroupModel(921702, "FITU", "II");
        GroupModel group921701 = new GroupModel(921701, "FITU", "II");

        TeacherModel teacher = new TeacherModel("Ivashenko", "+375441488228", "MRZvIS");

        DeanModel dean = new DeanModel("Shilin", "+375442281488");

        dean.addStudent(student1, group921702);
        dean.addStudent(student2, group921702);
        dean.addStudent(student3, group921702);

        dean.addStudent(student11, group921701);
        dean.addStudent(student22, group921701);

        System.out.println(teacher.showStudents(group921702));
        System.out.println(teacher.showStudents(group921701));

        //dean.expelStudent(group921702, "Anton Ladeiko");

        //System.out.println(teacher.showStudents(group921702));
        //System.out.println(student1.toString());
    }
}
