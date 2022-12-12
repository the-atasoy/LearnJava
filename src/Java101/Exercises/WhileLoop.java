package Java101.Exercises;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        double a = num.nextDouble();
        while (a>10 || a<1) {
            System.out.println(a + " is not between 1 and 10, please try again: ");
            a = num.nextDouble();
        }
        System.out.println(a + " is between 1 and 10.");
    }
}
