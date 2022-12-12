package ESTU.LabTasks;

import java.util.Random;
import java.util.Scanner;

public class GCD {

    public static void bruteForce(int first, int second){

        //swap
        if(first<second){
            int temp = first;
            first = second;
            second = temp;
        }
        int gcd = 1;
        for (int divisor = second; divisor>=2 ; divisor--){
            if(first % divisor==0 && second%divisor==0) {
                gcd = divisor;
                break;
            }
        }
        System.out.println("The greatest common divisor of " + first + " and " + second + " is " + gcd + ".");
    }

    public static void euclidean(int first, int second){

        //swap
        if(first<second){
            int temp = first;
            first = second;
            second = temp;
        }
        int remainder = first%second;

        while (remainder != 0){
            first = second;
            second = remainder;
            remainder = first%second;
        }
        int gcd = second;
        System.out.println("The greatest common divisor of " + first + " and " + second + " is " + gcd + ".");
    }

    public static void main(String[] args) {

        int first = (int)(Math.random() *100) + 1;
        int second = (int)(Math.random() *100) + 1;

        Scanner scan = new Scanner(System.in);
         int choice = scan.nextInt() ;



        System.out.print("If you want to use brute force algorithm, press 1. If you want to use Euclidean algorithm, press 2: ");
        if ( choice == 1){
            bruteForce(first, second);
           // System.out.println("1 seçtim first second" + first + second);
        }else if (choice == 2){
            euclidean(first, second);
          //  System.out.println("2 seçtim first second" + first + second);
        }
        Scanner scanner = new Scanner(System.in);
        int algorithm = scanner.nextInt();

        while(!((algorithm == 1) || (algorithm == 2))){
            System.out.print("The value you entered is not valid, please enter a valid value: ");
            algorithm = scanner.nextInt();
        }

        /*switch (algorithm){

            case 1:
                bruteForce(first, second);
                break;
            case 2:
                euclidean(first, second);
                break;
            default:
                break;
        }*/


    }
}
