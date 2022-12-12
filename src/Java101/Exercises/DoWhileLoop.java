package Java101.Exercises;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double d;
        do {
            System.out.print("enter a number between 1 and 10: ");
            d = s.nextDouble();

        }while (d>10 || d<1);
        System.out.println(d + " is between 1 and 10.");
    }
}
