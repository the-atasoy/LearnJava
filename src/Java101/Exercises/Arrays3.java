package Java101.Exercises;

import java.util.Scanner;

public class Arrays3 {

    public static int whichElement(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter that which element occured how many times: ");
        int sort = scan.nextInt();
        return sort - 1;
    }
    public static int occur(int[]x){
        int sum = 0;
        int index = whichElement();
        for(int i = 0; i < x.length; i++){
            if(x[i] == x[index]) {
                sum += 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many values do you want to exist in array: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter " + (i + 1) + ". value of array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println((whichElement()+1) + ". element occurs " + occur(array) + " times.");
    }
}
