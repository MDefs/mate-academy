package com.demo;


public class Student {

    private String fullName;
    private int age;
    private String department;
    private String groupName;
    private boolean babyFace;

    public Student(String fullName, int age, String department, String groupName, boolean babyFace) {
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.groupName = groupName;
        this.babyFace = babyFace;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean haveBabyFace() {
        return babyFace;
    }

    public int getAge() {
        return age;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getDepartment() {
        return department;
    }
}
