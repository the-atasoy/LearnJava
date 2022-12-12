package ESTU.Assignments;

import java.util.Scanner;

public class OddCount {
    public static int loopBasedCount (int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (!(i % 2 == 0)){
                count++;
            }
        }
        return count;
    }

    public static int mathBasedCount (int a, int b){

        int count = 0;

        if (b > 0) {
            if (a % 2 ==0){
                a++;
            }
            if (b % 2 == 0){
                b--;
            }
            count = (b - a) / 2 + 1;
        }

        else if(a <= 0 && b <= 0){
            if (a % 2 ==0){
                a++;
            }
            if (b % 2 == 0){
                b--;
            }
            a *= -1;
            b *= -1;
            count = (a - b) / 2 + 1;
        }


        if (a == b && !(b%2 == 0)){
            return 1;
        }
        else if (a == b && b%2 == 0) {
            return 0;
        }
        else
            return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = scan.nextInt();
        System.out.print("Please enter a number: ");
        int b = scan.nextInt();

        // swap
        if (a>b){
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Loop-based solution: The number of odds in range [" + a + ", " + b + "] = " + loopBasedCount(a,b));
        System.out.println("Math-based solution: The number of odds in range [" + a + ", " + b + "] = " + mathBasedCount(a,b));

    }
}
