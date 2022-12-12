package Java101.Exercises;

import java.util.Scanner;

public class Methods1 {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        System.out.println("your age is " + getAge() + ".");

    }
    public static int getAge (){
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

}
