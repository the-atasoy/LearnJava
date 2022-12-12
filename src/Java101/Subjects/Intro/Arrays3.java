package Java101.Subjects.Intro;

import java.util.Scanner;

public class Arrays3 {

    public static int sum (int... numbers){ // ...(ellipsis) uses for do something like in 16. line.

        int sum = 0;
        for (int i = 0; i<numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,5,7,-4));
        int[] nums = {4,85,-8,7};
        System.out.println(sum(nums));
        System.out.println();

    }
}
