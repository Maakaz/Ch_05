package com.company;

/**
 * Created by hei on 8.11.2016.
 */
import java.util.Scanner;
public class Exercise1 {

        public static void exerciseOne(int x){
            if (x > 0 && x < 10){
            System.out.println("positive single digit number.");
            }
        }

    public static void main() {
        Scanner tpt = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = tpt.nextInt();
        exerciseOne(x);
    }
}
