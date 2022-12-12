package Java101.Exercises;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter the number you want to learn it even or odd is: ");
        double eo = num.nextDouble();
        if(eo % 2 == 1)
            System.out.println("the number is odd.");
        if (eo % 2 == 0)
            System.out.println("the number is even.");

    }
}
