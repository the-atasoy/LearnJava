package Java101.Exercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.println("please enter operation you want to execute ( you have to put spaces between numbers and operators such as 9 + 5):");

        double a = digit.nextDouble();
        String c = digit.next();
        double b = digit.nextDouble();

        switch (c) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
            default:
                System.out.println("error");
        }
    }
}
