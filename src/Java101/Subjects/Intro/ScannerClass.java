package Java101.Subjects.Intro;

import java.util.Scanner;

public class ScannerClass
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name: ");
        System.out.println("Your name is: " + input.nextLine()); // if you want to input string more than one you need
                                                                 // use nextLine instead of next


        /*
            there are some input methods like next(), nextLine(), nextInt(), nextBoolean()...
         */



            test();
    }

    public static void test()
    {
        Scanner test = new Scanner(System.in);
        System.out.println("Yaşınız kaç: ");
        int age = test.nextInt();
        System.out.println("yaşınız : " + age );

    }
}
