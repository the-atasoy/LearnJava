package Java101.Exercises;

import java.util.Scanner;

public class Loops7 {
    public static void main(String[] args) {
        System.out.println("What fibonacci number do you want to learn: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f1 = 1;
        int f2 = 1;
        int sum = 0;

        if (n == 1) {
            System.out.println("Number " + n + " fibonacci number is " + f1 + ".");
        }

        else if (n == 2) {
            System.out.println("Number " + n + " fibonacci number is " + f2 + ".");
        }

        else {

            for (int i = 1; i <= n - 2; i++) {

                sum = f1 + f2;
                f1 = f2;
                f2 = sum;

            }
            System.out.println("Number " + n + " fibonacci number is " + sum + ".");
        }

    }
}
