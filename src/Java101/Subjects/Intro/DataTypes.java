package Java101.Subjects.Intro;

public class DataTypes
{
    public static void main(String[] args)
    {
        byte b1 = 5;
        short s1 = 54;
        int i1 = 698;
        long l1 = 255; // this is a integer because there is no L end of the 255. a long can store an integer.
        long l2 = 595946549747987L; // this is a long
        // these data types can store each other from larger to smaller


        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(l2);


        System.out.println(b1 - s1);
        System.out.println(i1-l2);


        l1 = b1; // b1 can be assigned to l1
        System.out.println(l1);

        // s1 = l1; this code does not work because interval of a short is smaller than a interval of a long

    }

}
