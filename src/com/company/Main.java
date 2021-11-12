package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    private static String[] colours = {"red", "green", "blue"};
    private static String[] randomColour = new String[10];

    public static void main(String[] args) {
        System.out.println("Please guess a colour");
        
    }

    public static void colourSetup() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
        randomColour[i] = colours[random.nextInt(3)];
        }
    }

}
