package com.company;

import java.util.Scanner;

/**
 * Created by hei on 8.11.2016.
 */
public class Exercise5 {
    public static void main() {
        exerciseFive(99);
    }

    public static void exerciseFive(int g){
/* Viskas errori ette, ei saanud samasse while funktsiooni
 * naiteks numbrit 99 ja 98,
 * kuid tundub, et sedasi saab ka päris adekvaatselt laulda.*/
        while (g > 0) {
            System.out.printf("%d bottles of beer on the wall,\n", g);
            System.out.printf("%d bottles of beer,\n", g);
            System.out.printf("ya' take one down, ya' pass it around,\n");
            System.out.println("Minus one bottle left of beer on the wall.\n");
            g = g - 1;
        }
        if (g <= 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no more bottles of beer on the wall!");
        }
    }
}
