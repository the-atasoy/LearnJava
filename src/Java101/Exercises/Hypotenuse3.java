package Java101.Exercises;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Hypotenuse3
{
    public static void main(String[] args)
    {
        Scanner tri = new Scanner(System.in);
        System.out.println("What are leg lengths of right triangle?");
        System.out.println("First leg: ");
        double l1 = tri.nextDouble();
        System.out.println("Second leg: ");
        double l2 = tri.nextDouble();
        double h = Math.pow((Math.pow(l1,2) + Math.pow(l2,2)),0.5);
        System.out.println("Hypotenuse of the triangle you entered leg lengths is " + h + ".");


    }
}
