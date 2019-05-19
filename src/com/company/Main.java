package com.company;
/*
W języku HTML każdy fragment tekstu może być na różne sposoby „otagowany”, czyli otoczony odpowiednimi znacznikami.
Załóżmy, że mamy klasę PlainText przechowującą fragment tekstu. Klasa ta posiada funkcję składową void write(),
która wypisuje do strumienia wyjściowego programu tekst zapisany w obiekcie tej klasy.
Obiekt klasy PlainText może być „otagowany” znacznikami <p>, <strong>, <em>, <mark>.
Każdy dozwolony w HTML układ „otagowania” tekstu tymi znacznikami jest możliwy.
„Otagowany” tekst ma być wyprowadzany do strumienia wyjściowego funkcją składową posiada funkcję składową void write().
Proszę zidentyfikować prosty wzorzec projektowy pozwalający na wyprowadzenie do strumienia wyjściowego
„otagowanego” w dowolny sposób tekstu obiektu klasy PlainText. Bazując na zidentyfikowanym wzorcu proszę napisać
program (może być konsola), który:
Pozwoli użytkownikowi na wprowadzenie jednolinijkowego tekstu.
Pozwoli na wybranie jakimi znacznikami ma być „otagowany” wprowadzony tekst (znaczniki wskazane wyżej),
dozwolona jest dowolna kombinacja znaczników.
Wyprowadzi do strumienia wyjściowego odpowiednio „otagowany” tekst HTML.
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu(new ConsoleInput(), new PlainText("text"));
        menu.start();


    }
}
