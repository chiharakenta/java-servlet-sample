package com.mycompany.app.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", "hogehoge@example.com"));
        students.add(new Student("Mary", "Public", "fugafuga@example.com"));
        students.add(new Student("Bonita", "Applebum", "piyopiyo@example.com"));
        return students;
    }
}
