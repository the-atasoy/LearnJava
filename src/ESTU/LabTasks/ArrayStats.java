package ESTU.LabTasks;

import java.util.Random;

public class ArrayStats {

    public static int[] initRandomArray() {

        Random rand = new Random();
        int arrayLength = rand.nextInt(20) + 1;

        int[] arr = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++){
            arr[i] = rand.nextInt(20) + 1;
        }
        return arr;
    }

    public static int getMax(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static double getMean(int[] arr) {

        double sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double mean = sum / arr.length;
        return mean;
    }

    public static void printArray (int[] arr){

        System.out.print("Your array is: [");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        int myArr[] = initRandomArray();

        printArray(myArr);
        System.out.println("Maximum value of your array is " + getMax(myArr) + ".");
        System.out.println("Minimum value of your array is " + getMin(myArr) + ".");
        System.out.println("Mean value of your array is " + getMean(myArr) + ".");

        System.out.println("try");
    }

}
