package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    //Instance Variables
    private String name;
    private int age;
    private String studentId;
    private List<String> courses;

    public Student(String name, int age, String studentId) {
        super();
        if (validateAge(age) && validateName(name) && validateStudentId(studentId)) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        courses = new ArrayList<String>();
    }
    }



    public void enrollCourse(String course) {
        if (validateCourseName(course)) {
            if (!courses.contains(course)) {
                courses.add(course);
                System.out.println("Student is enrolled " + course + " successfully!!");
            } else {
                System.err.println("Student is already enrolled in " + course);
            }

        }

    }

    public void printStudentInfo(){
        System.out.println("=================== Student Data ====================");
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Courses: " + courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", courses=" + courses +
                '}';
    }

    //Validation methods
    public boolean validateAge(int age) {
        if (age >= 19 && age <= 35) {
            return true;
        } else {
            System.err.println("Invalid age!! Student age needs to be between 19 and 35");
            return false;
        }
    }

    public boolean validateName(String name){
        //kajal
        String  nameRegex = "^[a-zA-Z\\s]+$";
        Pattern namePattern = Pattern.compile(nameRegex);
        Matcher nameMatcher = namePattern.matcher(name);
        if (nameMatcher.matches()) {
            return true;
        } else {
            System.err.println("Invalid name!! Student name can only contain alphabets and spaces");
            return false;
        }
    }


    public boolean validateStudentId(String studentId) {
        String studentIdRegex = "S-\\d+$";
        Pattern studentIdPattern = Pattern.compile(studentIdRegex);
        Matcher studentIdMatcher = studentIdPattern.matcher(studentId);
        if (studentIdMatcher.matches()) {
            return true;
        } else {
            System.err.println("Invalid student id!! Student id should be in the format S-xxxxx");
            return false;
        }
    }

    public boolean validateCourseName(String course){
        if (course.equalsIgnoreCase("java") || course.equalsIgnoreCase("DSA") ||
                course.equalsIgnoreCase("Devops")){
            return true;
        } else {
            System.err.println("Invalid course name!! Course name should be either java, DSA or Devops");
            return false;
        }
    }



}
