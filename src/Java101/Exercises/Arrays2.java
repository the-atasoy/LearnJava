package Java101.Exercises;

import java.util.Scanner;

public class Arrays2 {
    public static int sum(int[] x){
        int arrayLength = x.length;
        int sum = 0;
        for (int i = 0; i < arrayLength; i++){

            sum += x[i];
        }
        return sum;
    }

    public static int product(int[] x){
        int arrayLength = x.length;
        int product = 1;
        for (int i = 0; i < arrayLength; i++){

            product *= x[i];
        }
        return product;
    }

    public static int average(int[] x){
        int arrayLength = x.length;
        int average = sum(x)/arrayLength;
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many values do you want to exist in array: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            System.out.print("Please enter " + (i+1) + ". value of array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Sum of these numbers are " + sum(array) + ".");
        System.out.println("Product of these numbers are " + product(array) + ".");
        System.out.println("average of these numbers are " + average(array) + ".");

    }
}
