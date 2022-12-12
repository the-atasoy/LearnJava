package Java101.Exercises;

import java.util.Scanner;

public class FavoriteNumber1
{
    public static void main(String[] args)
    {
        System.out.println("What is your favorite number?");
        Scanner numb = new Scanner(System.in);
        int f = numb.nextInt();
        System.out.println("I do not like the number " + f);

    }
}
