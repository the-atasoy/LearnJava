package Java101.Subjects.Intro;

public class InstantinatingObject
{
    public static void main(String[] args)
    {
        String name1 = "Barış Atasoy";
        String name2 = "Barış Atasoy";
        String name3 = new String("Barış Atasoy");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        /*
            all of these Strings print same code to screen but last Barış Atasoy is different than others.
            name1 and name2 have same value however name3 does not have.
         */

    }
}
