package Java101.Exercises;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int n = s.nextInt();
        switch (n%2){
            case 0:
                System.out.println("the number is even.");
                break;
            default:
                System.out.println("the number is odd.");
        }


    }
}

