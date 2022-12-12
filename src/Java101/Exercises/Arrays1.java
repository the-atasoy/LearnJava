package Java101.Exercises;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integer do you want to enter to array: ");
        int input = scanner.nextInt();
        while(!(input<=20 && input>=1)){
            System.out.print("The value you entered is not valid, please enter a valid value: ");
            input = scanner.nextInt();
        }
        int[] array = new int[input];

        for (int i = 0; i<input; i++){
            System.out.print("Please enter " + (i+1) + ". value of array:");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }

    }
}
