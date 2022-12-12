package Java101.Subjects.Intro;

import java.util.Scanner;

public class Arrays2 {
    public static void printArray (int[] array){

            for (int i = 0; i < array.length; i++ ){

                System.out.println("Element " + i + " is " + array[i] + ".");
            }
    }

    public static void average (int[] aritmethic){
        int sum = 0;
        double ave = 0;
        for (int i = 0; i < aritmethic.length; i++) {

            sum += aritmethic[i];
            ave = sum/(i+1);
        }
        System.out.println("Arithmetic average of numbers you entered is " + ave + ".");
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter five integer value: ");
        a[0] = input.nextInt();
        a[1] = input.nextInt();
        a[2] = input.nextInt();
        a[3] = input.nextInt();
        a[4] = input.nextInt();


        printArray(a);
        average(a);
    }
}
