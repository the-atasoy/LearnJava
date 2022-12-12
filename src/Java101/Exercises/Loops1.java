package Java101.Exercises;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        int i;

        for (i= 1; i<=100; i++){
            if(i%2 == 1)
                continue;
            System.out.println(i);
        }
    }
}
