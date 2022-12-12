package Java101.Exercises;

import java.util.Scanner;

public class Loops4 {
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

            if (sum == 1+n)
                System.out.println(n + " is a prime number. ");
            else
                System.out.println(n + " is not a prime number. ");
        }
    }
