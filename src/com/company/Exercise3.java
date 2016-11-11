package com.company;
import java.util.Scanner;
/**
 * Created by hei on 8.11.2016.
 */
public class Exercise3 {

    public static void main() {
        nLines(4);
    }
    public static void nLines(int n) {
        if (n > 0) {
            System.out.println("line");
            nLines (n -1);
        }
    }
}
