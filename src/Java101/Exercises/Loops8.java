package Java101.Exercises;

import java.util.Scanner;

public class Loops8 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s = str.nextLine();
        int l = s.length();

        for (int i = 0; i < l-1; i++){

            char result = s.charAt(i);
            System.out.print(result + " ");


        }
        char r = s.charAt(l-1);
        System.out.print(r);


    }
}
