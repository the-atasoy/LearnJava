package Java101.Exercises;

import java.util.Scanner;

public class Loops10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){

            for (int j = 1; j <= i; j++ )

                System.out.print(i);

            System.out.println();
         }
    }
}
