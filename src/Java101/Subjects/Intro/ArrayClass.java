package Java101.Subjects.Intro;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

    public static int[] enterArray (int number){
        Scanner input = new Scanner(System.in);
        int[] print = new int[number];

        for (int i = 0; i<number; i++){
            System.out.print("Enter an integer value: ");
            print[i] = input.nextInt();
        }
        return print;
    }

    public static void printArray (int[] out){
        for (int i = 0; i < out.length; i++){
            System.out.println("element " + (i+1) + " is " + out[i] + ".");
        }
    }

    public static void sortArray (int[] sorting){
        Arrays.sort(sorting);
        printArray(sorting);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter how many value are there in array: ");
        int[] a = enterArray(scanner.nextInt());
        printArray(a);
        sortArray(a);
    }
}
