package com.demo;

import java.util.Scanner;


public class Menu {

    private Professor professor;
    private Group group;
    private Student student;
    private static Scanner scanner = new Scanner(System.in);

    public void createGroup() {
        System.out.print("Group name: ");
        String groupName = scanner.nextLine();
        System.out.print("Group size: ");
        String size = scanner.nextLine();
        while (!isDigit(size)) {
            System.out.print("Group size: ");
            size = scanner.nextLine();
        }
        int groupSize = Integer.parseInt(size);
        System.out.print("Professor’s full name: ");
        String professorName  = scanner.nextLine();

        professor = new Professor(professorName);
        group = new Group(groupName, groupSize);
        professor.setGroup(group);

        char next = 0;
        while (next != 'S') {
            if (group.getStudentCounter() == group.getStudents().length) {
                System.out.println("Group is full!");
                break;
            }
            System.out.println("--------");
            System.out.println("Students");
            createStudent();
            group.addStudent(student);
            System.out.println("Input 'S' to stop or something else to continue");
            next = scanner.next().charAt(0);
            scanner.nextLine();
        }
    }

    private void createStudent() {
        System.out.print("Full name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        String ageStr = scanner.nextLine();
        while (!isDigit(ageStr)) {
            System.out.print("Age: ");
            ageStr = scanner.nextLine();
        }
        int age = Integer.parseInt(ageStr);
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Baby face(Yes/No): ");
        String babyFace = scanner.nextLine();
        while (!babyFace.equals("Yes") && !babyFace.equals("No")) {
            System.out.print("Baby face(Yes/No): ");
            babyFace = scanner.nextLine();
        }
        boolean face;
        if (babyFace.equals("Yes")) face = true;
        else face = false;

        student = new Student(name, age, department, group.getName(), face);

    }

    public boolean isDigit(String s) {
        int i = 0;
        try {
            i = Integer.parseInt(s);
            if (i < 0) {
                System.out.println("Incorrect data");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect data");
            return false;
        }
        return true;
    }

    public void getCaptain() {
        group.getCaptain();
    }

    public void isPresent() {
        professor.isPresent();
    }

    public void showStudents() {
        group.showStudents();
    }

}
