package com.company;
import java.util.Scanner;
/**
 * Created by hei on 8.11.2016.
 */
public class Exercise4 {

    public static void main() {
        Scanner elp = new Scanner(System.in);
        System.out.println("Enter a: ");
        int r = elp.nextInt();
        System.out.println("Enter b: ");
        int j = elp.nextInt();
        System.out.println("Enter c: ");
        int w = elp.nextInt();
        System.out.println("Enter m: ");
        int q = elp.nextInt();
        checkFermat(r, j, w, q);
    }

    public static void checkFermat(int a, int b, int c, int m){

        double k = Math.pow(a, m);
        double l = Math.pow(b, m);
        double z = Math.pow(c, m);

        if (m == 2 || m == 1){
            System.out.printf("The answer: %f\n", z);
            System.out.printf("To chech the answer: a = %f, b = %f and c = %f.\n", k, l, z);
        }
        else if (m > 2){
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else {
            System.out.println("No, that doesn't work.");
        }
        return;
    }
}
