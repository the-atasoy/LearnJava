package Java101.Exercises;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("please enter a number:");
        double var = n.nextDouble();
        if (var>10) {
            System.out.println(var + " is greater than ten.");
        }
        else if (var == 10) {
            System.out.println(var + " is equal to ten.");
        }
        else {
            System.out.println(var + " is smaller than ten. ");
        }
    }
}
