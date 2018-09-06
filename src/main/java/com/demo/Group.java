package com.demo;


public class Group {

    private String name;
    private int studentCounter;
    private Student[] students;

    
    public Group(String name, int length) {
        this.name = name;
        this.students = new Student[length];
    }

    public String getName() {
        return name;
    }

    public int getStudentCounter() {
        return studentCounter;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students[studentCounter] = student;
        studentCounter++;
    }

    public void showStudents() {
        for (int i = 0; i < studentCounter; i++) {
            System.out.println(students[i].getFullName() + " " + students[i].getAge() + " " +
                               students[i].getDepartment() + " " + students[i].getGroupName());
        }
    }

    public void getCaptain() {
        Student captain = students[0];
        for (int i = 0; i < studentCounter; i++) {
            if (students[i].getAge() > captain.getAge() && !students[i].haveBabyFace()) {
                captain = students[i];
            }
        }

        System.out.println(captain.getFullName() + " " + captain.getAge() + " " +
                           captain.getDepartment() + " " + captain.getGroupName());
    }

}
