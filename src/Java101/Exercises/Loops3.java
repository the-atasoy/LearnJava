package Java101.Exercises;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        System.out.println("please enter a number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int div;

        for (int i = 1; i<=n; i++) {

            div = n/i;

            if (n%i == 0)
                sum += div;

        }
        System.out.println("sum of strict divisors of " + n + " is " + sum + ".");

    }
}
