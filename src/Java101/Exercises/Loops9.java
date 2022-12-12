package Java101.Exercises;

import java.util.Scanner;

public class Loops9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word you want to if or not it palindrome is: ");
        String pal = input.nextLine();
        boolean isPalindrome = true;

        for (int j = 0, k = pal.length()-1; j < k; j++, k--){

            if(pal.charAt(j) == pal.charAt(k))
                continue;

            isPalindrome = false;
            break;

        }
        System.out.println(isPalindrome ? pal + " is palindrome." : pal + " is not palindrome.");
    }
}
