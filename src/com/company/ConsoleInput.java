package com.company;

import java.util.*;

public class ConsoleInput {
    String text;
    int choice;
    Scanner read = new Scanner(System.in);
    List<Integer> choices = new ArrayList<>();
    List<Integer> possibleChoices = Arrays.asList(1, 2, 3, 4);


    public String getText() {
        System.out.print("What text you want to be tagged? \n> ");
        return read.nextLine();

    }

    public Integer getChoice() {
        if (choices.containsAll(possibleChoices)) {
            System.out.println("All possible tags are already used. ");
            return 0;
        }
        System.out.print("Choose what you want to do: \n\t" +
                "1. Add em tag\n\t2. Add mark tag\n\t3. Add p tag\n\t4. Add strong tag\n\t0. Exit\n> ");
        do {
            choice = Integer.parseInt(read.nextLine());

            if (!choices.contains(choice)) {
                choices.add(choice);
                return choice;

            } else {
                System.out.print("This tag is already used, choose again\n>");
            }

        }
        while (true);

    }
}
