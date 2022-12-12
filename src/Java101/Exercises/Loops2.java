package Java101.Exercises;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Please enter a number: ");
            sum += input.nextInt();

            if (sum >= 100)
                break;
        }
        System.out.println("done:" + sum);
    }
}
