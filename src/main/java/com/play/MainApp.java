package com.play;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("What is your age? ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.trim();
        int age = Integer.parseInt(line);
        int ageRequirement = 19;

        if (age < 0) {
            System.out.println("invalid age");
        } else if (age > 100) {
            System.out.println("are you really that old?");
        } else if (age < ageRequirement) {
            System.out.println("you are too young to drink");
        } else {
            System.out.println("you are old enough to drink"); // hello
        }
    }
}
