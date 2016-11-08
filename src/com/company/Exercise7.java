package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by hei on 8.11.2016.
 */
public class Exercise7 {
    public static void main() {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        Scanner pa = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is? ");
        System.out.println("Type a number ");
        int num3 = pa.nextInt();
        System.out.printf("Your quess is: %d", num3);
        System.out.printf("\nThe number i was thinking of is: %d", number);
        int num4 = num3 - number;
        int num5 = number - num3;

        if (num3 == number) {
            System.out.println("\nYou guessed the number!");
        }
        else if (num3 < number) {
            System.out.printf("\nYou were off by: %d", num5);
        }
        else {
            System.out.printf("\nYou were off by: %d \n", num4);
        }

    }
}
