

/* this code does not work right, algorithm mistake.*/


package Java101.Exercises;

import java.util.Arrays;
import java.util.Random;

public class Arrays4 {
    public static void main(String[] args) {
        int capacity = (int)(Math.random()*15 + 1);
        int[] array = new int[capacity];

        for (int i = 0; i<array.length; i++){
            array[i] = (int)(Math.random()*100 + 1);
        }
        Arrays.sort(array);

        int[] odd = new int[array.length];
        int[] even = new int[array.length];

        for (int i = 0; i<array.length; i++){
            if(array[i]%2 == 1){
                odd[i] = array[i];
            }
            else{
                even[i] = array[i];
            }
        }
        for (int i = 0; i< array.length; i++){
            System.out.println(even[i]);
        }
        System.out.println("\n\n");


        int[] lastArray = new int[array.length];

        for (int i = 0; i<array.length; i++){
            if (odd[i]==0)
                break;
            lastArray[i] = odd[i];
        }
        for (int i = odd.length; i< array.length; i++){
            if (even[i]==0)
                break;
            lastArray[i] = even[i];
        }

        for (int i = 0; i< array.length; i++){
            System.out.println(lastArray[i]);
        }


    }
}
