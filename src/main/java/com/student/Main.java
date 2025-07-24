package com.student;

public class Main {

    public static void main(String[] args) {
        System.out.println("***************STUDENT MANAGEMENT SYSTEM*************");
        System.out.println("***************WELCOME!*************");

        Student s1 = new Student("Kajal", 22, "S-1");
        s1.enrollCourse("Java");
        s1.enrollCourse("DSA");
        s1.enrollCourse("Devops");
        s1.enrollCourse("C#");
        //System.out.println(s1);
        s1.printStudentInfo();
    }
}
