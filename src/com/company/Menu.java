package com.company;

import java.util.Scanner;

public class Menu {
    Scanner read = new Scanner(System.in);
    int choice;
    Text text;
    ConsoleInput input;

    public Menu(ConsoleInput input, PlainText text) {
        this.input=input;
        this.text=text;

    }

    public void start() {

       // text.setContent(input.getText());
        do {
            //trzeba dodać moze listę gdzie bedą zapisyawne dokonane wybory już, żeby nie mozna byló zrobić dwa razy takiego samego tagu
        int choice = input.getChoice();
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
            }

            if(choice != 0){
                System.out.println("\tYour text: ");
                text.write();

            }

        } while (choice != 0);
    }
}