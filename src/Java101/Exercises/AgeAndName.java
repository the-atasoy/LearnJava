package Java101.Exercises;

import java.util.Scanner;

public class AgeAndName
{
    public static void main(String[] args)
    {
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        System.out.println("What is your name: ");
        String n = name.nextLine();
        System.out.println("What is your age: ");
        String a = age.nextLine();
        System.out.println("You are " + a + " years old " + n + ".");

                      //--------------Another way----------------//

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name and age in  order: ");
        String nam = input.nextLine();
        int ag = input.nextInt();
        System.out.println("You are " + ag + " years old " + nam + ".");

    }
}
