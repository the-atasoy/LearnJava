package ESTU.LabTasks;

import java.util.Scanner;

public class Palindrome {
    public static int reverse (int number){
        String num = Integer.toString(number);
        int length = num.length();

        int reversed = 0;

        for (int i = 0; i < length; i++){
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome (int pal){
        return (reverse(pal) == pal);
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = scanner.nextInt();
        if (isPalindrome(input)){
            System.out.println("The number you entered is a palindrome number.");
        }
        else {
            System.out.println("The number you entered is not a palindrome number.");

        }


    }
}
