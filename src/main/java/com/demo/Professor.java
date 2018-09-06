package com.demo;


public class Professor {

    private String fullName;
    private Group group;

    public Professor(String fullName) {
        this.fullName = fullName;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void isPresent() {
        int groupNumber = group.getStudents().length;
        int studentsNumber = group.getStudentCounter();
        if (groupNumber == studentsNumber) {
            System.out.println("All students are present!");
        } else {
            System.out.println("number of absentees: " + (groupNumber-studentsNumber));
        }
    }

}
