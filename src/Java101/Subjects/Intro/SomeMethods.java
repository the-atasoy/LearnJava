package Java101.Subjects.Intro;

public class SomeMethods
{
    public static void main(String[] args)
    {
        String s1= "ThE AtaSoY";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());

        String e1 = "";
        String e2 = "  " ;
        System.out.println(e1.isEmpty());
        System.out.println(e1.isBlank());
        System.out.println(e2.isEmpty());
        System.out.println(e2.isBlank());

        String c1 = "abcda";
        char c = c1.charAt(1);
        System.out.println(c); // this code types second index of c1 to the screen.

        System.out.println(c1.indexOf("b")); // what is the sort of b in c1. if there is no the string in abcd,
                                             // result will be -1.

        System.out.println(c1.indexOf("a")); // result is 0 because a is first character.
        System.out.println(c1.lastIndexOf("a")); // result is 4 because the last a is fourth character.

        String s2 = c1.concat("efg");
        System.out.println(s2);

    }
}
