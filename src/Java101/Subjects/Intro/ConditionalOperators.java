package Java101.Subjects.Intro;

public class ConditionalOperators
{
    public static void main(String[] args)
    {
        String name = "Baris";
        boolean con = name.isEmpty();
        System.out.println(con ? "Name is not valid." : name);

        // if variable name is empty print "Name is not valid", if is not empty print the name.
    }
}
