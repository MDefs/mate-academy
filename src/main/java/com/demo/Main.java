package com.demo;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        int choice = 20;
        String choiceStr = "";
        System.out.println("Choose 1, 2, 3, 4 or 0 to exit");
        while (choice != 0) {
            System.out.println("1. Create group");
            System.out.println("2. Get group captain");
            System.out.println("3. Checking if everyone is present");
            System.out.println("4. Show students");
            System.out.println("0. Exit");
            choiceStr = scanner.nextLine();
            if (menu.isDigit(choiceStr)) {
                choice = Integer.parseInt(choiceStr);
            }
            switch (choice) {
                case 1:
                    menu.createGroup();
                break;
                case 2:
                    menu.getCaptain();
                break;
                case 3:
                    menu.isPresent();
                break;
                case 4:
                    menu.showStudents();
                    break;
                default:
                    System.out.println("Choose 1, 2, 3 or 0 to exit");

            }
        }


    }

}
