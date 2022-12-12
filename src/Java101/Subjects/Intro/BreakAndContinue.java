package Java101.Subjects.Intro;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i =0; i<=10; i++){
            if (i%2 == 0)
                continue; // if i%2==0, the loop will loop before System.out.print(i + " ");
                          // otherwise, System.out.print(i + " "); will work.

            System.out.print(i + " ");
        }


        Scanner s = new Scanner(System.in);
        int a;
        while (true){

            System.out.println("\n" + "Please enter a number between 1 and 10: ");
            a = s.nextInt();
            if (a<1 || a>10)
                continue;;

            System.out.println(a + " is between 1 and 10.");
            break;
        }
    }
}
