package com.student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    //Instance Variables
    private String name;
    private int age;
    private String studentId;
    private List<String> courses;

    public Student(String name, int age, String studentId) {
        super();
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        courses = new ArrayList<String>();
    }

    public void enrollCourse(String course) {
        courses.add(course);
    }
}
