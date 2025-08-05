package com.student;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    private static List<Student> studentList;

    public static void main(String[] args) {
        System.out.println("***************STUDENT MANAGEMENT SYSTEM*************");
        System.out.println("***************WELCOME!*************");

        studentList = new ArrayList<>();

        Student s1 = new Student("Kajal", 22, "S-1");
        s1.enrollCourse("Java");
        s1.enrollCourse("DSA");
        s1.enrollCourse("Devops");
        s1.enrollCourse("C#");


        Student s2 = new Student("Uday", 24, "S-11");
        s2.enrollCourse("Java");


        Student s3 = new Student("Ritu", 27, "S-13");
        s3.enrollCourse("Devops");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Student result = findStudentById("S-11");
        System.out.println("result : " + result);

    }


    public static Student findStudentById(String studentId){
        Student result = null; // ex[licit intialzing

        try {
            result = studentList
                    .stream()
                    .filter(x -> x.getStudentId().equalsIgnoreCase(studentId))
                    .findFirst().orElseThrow(() -> new RuntimeException("Student not found"));
        } catch (RuntimeException e) {
            System.err.println("Student with id " + studentId + " not found!!");
        }
        return result;
    }
}
