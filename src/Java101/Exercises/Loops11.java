package Java101.Exercises;

import java.util.Scanner;

public class Loops11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= n-i; k++){

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){

                System.out.print("*");
            }
            for (int l = 1; l <= n-i; l++){

                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
