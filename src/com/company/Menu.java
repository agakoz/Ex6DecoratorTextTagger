package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner read = new Scanner(System.in);
    int choice;
    Text text;
    ConsoleInput input;



    public Menu(ConsoleInput input, PlainText text) {
        this.input = input;
        this.text = text;

    }

    public void start() {

        text.setContent(input.getText());

        do {

            choice = input.getChoice();

            switch (choice) {
                case 1:
                    text = new EmTag(text);
                    break;
                case 2:
                    text = new MarkTag(text);
                    break;
                case 3:
                    text = new PTag(text);
                    break;
                case 4:
                    text = new StrongTag(text);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error");

            }

            if (choice != 0) {

                System.out.println("\tYour text: ");
                text.write();
                System.out.println("\n");
            }



        } while (choice != 0);
    }
}