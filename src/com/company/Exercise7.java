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
        System.out.println("Type a number: ");
        int num3 = pa.nextInt();
        System.out.printf("Your quess is: %d", num3);
        System.out.printf("\nThe number i was thinking of is: %d", number);

        int io = num3 - number;
        int oi = number - num3;
        gameOn(num3, number, io, oi);
        while (num3 != number) {
            number = random.nextInt(100)+1;
            System.out.printf("\nType a number: ");
            num3 = pa.nextInt();
            System.out.printf("\nYour quess is: %d", num3);
            System.out.printf("\nThe number i was thinking of is: %d", number);
            gameOn(num3, number, io, oi);
        }
    }

    public static void gameOn(int y, int u, int i, int o){

        i = y - u;
        o = u - y;

        if (y == u) {
            System.out.println("\nYou guessed the number!");
        } else if (y < u) {
            System.out.printf("\nYou were off by: %d, your guess was a bit low. Guess again", o);
        } else {
            System.out.printf("\nYou were off by: %d, your guess was a bit high. Guess again \n", i);
        }
    }

}
