package Java101.Exercises;

import java.util.Scanner;

public class Loops5 {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int ma = i;
        int mi = i;
        while (i>=0) {

            System.out.println("Please enter a number: ");
            i = s.nextInt();
            if (i>ma)
                ma = i;
            else if (i<mi)
                mi = i;

        }

        System.out.println("The maximum number is " + ma + " and minimum number is " + mi + "."  );
    }
}
