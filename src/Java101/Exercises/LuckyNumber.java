package Java101.Exercises;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner lucky = new Scanner(System.in);
        System.out.println("Please enter a four digit number: ");
        int num = lucky.nextInt();
        int a = (num/1)%10;
        int b = (num/10)%10;
        int c = (num/100)%10;
        int d = (num/1000)%10;

        if (num>9999)
            System.out.println("You must enter a four digit number ");
        else if (num<1000)
            System.out.println("You must enter a four digit number ");
        else if ((a+b) == (c+d))
            System.out.println("The number you entered is a lucky number.");
        else if ((a+b) != (c+d))
            System.out.println("The number you entered is not a lucky number.");



    }
}
