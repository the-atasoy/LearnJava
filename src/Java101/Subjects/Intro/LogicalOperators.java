package Java101.Subjects.Intro;

public class LogicalOperators
{
    public static void main(String[] args)
    {
        boolean b1 = true && true; // true
        boolean b2 = b1 && false && true;// false
        boolean b3 = b2 || true; // true
        boolean b4 = !b2; // true
        boolean b5 = ! (b4 && b2); // true


    }
}
