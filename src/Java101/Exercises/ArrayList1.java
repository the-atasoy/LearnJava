package Java101.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> unique = new ArrayList<>();
        System.out.print("Enter 10 value for array: ");

        for (int i = 0; i < 10; i++){
            unique.add(scan.nextInt());
        }
        Collections.sort(unique);

        for (int i = 0; i < unique.size()-1; i++){
            if (unique.get(i).equals(unique.get(i+1))){
                unique.remove(i);
                i--;
            }
        }
        System.out.println("Your unique sorted elements are: " + unique);
    }
}
