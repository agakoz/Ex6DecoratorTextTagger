package com.company;

import java.util.Scanner;

public class ConsoleInput {
    String text;
    int choice;
    Scanner read = new Scanner(System.in);

    public String getText() {
        System.out.print("What text you want to be tagged? \n> ");
        return read.nextLine();
    }

    public Integer getChoice() {
        System.out.print("Choose what you want to do: \n\t" +
                "1. Add em tag\n\t2. Add mark tag\n\t3. Add p tag\n\t4. Add strong tag\n\t0. Exit\n> ");
        return Integer.parseInt(read.nextLine());
    }
}
