package Java101.Exercises;

import java.util.Scanner;

public class Loops6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = s.nextInt();
        int sum = 0;
        int mod;
        while (n>=1) {

            mod = n % 10;
            sum += mod;
            n /= 10;


        }
        System.out.println("The sum of digits is " + sum + ".");


    }
}
