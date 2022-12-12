package Java101.Subjects.Intro;

public class IfStatement
{
    public static void main(String[] args)
    {
        if (false)
            System.out.println("inside");
        System.out.println("outside"); // outside will be printed to screen because it is not included if statement.


        int x = 5;
        int y = 10;
        if (y>x)
        {
            System.out.println("the maximum number is " + y + ".");
        }
        if (x>y)
        {
            System.out.println("the maximum number is " + x + ".");
        }
        else
        {
            System.out.println("numbers are equal.");
        }
    }
}
