package Java101.Subjects.Intro;

public class IncrementDecrement
{
    public static void main(String[] args)
    {
        int i = 1;
        int j = ++i;
        System.out.println("i is " + i + " and j is " + j + ".");

        int a = 1;
        int b = a++;
        System.out.println("a is " + a + " and b is " + b + ".");

        /* if ++ is before i, ++ affects j but if ++ is after i, ++ only affects i.*/
        // same rules are valid for --.



    }
}
