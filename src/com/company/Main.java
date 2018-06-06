package com.company;

import java.util.*;

public class Main {

    static final int LENGTH = 2;
    static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        // write your code here

        Random random = new Random();
        int item = random.nextInt(2);
        // System.out.println(item);
        int index = random.nextInt(LENGTH);

        String[] hedge = new String[ARRAY_SIZE];
        hedge[0] = "Tell me more";
        hedge[1] = "Many of my patients tell me the same thing";
        hedge[2] = "It's getting late";

        String[] qualifiers = new String[ARRAY_SIZE];
        qualifiers[0] = "My teacher hates me";
        qualifiers[1] = "Why do you say that";
        qualifiers[2] = "So you are concerned that";

        String sentence = " your teacher hates you";

        int selection = random.nextInt(1);

        switch (selection) {
            case 0: {
                System.out.println(qualifiers[item] + sentence + "?");
                break;
            }
            case 1: {
                System.out.println(hedge[index]);
                break;
            }
        }

    }

}
