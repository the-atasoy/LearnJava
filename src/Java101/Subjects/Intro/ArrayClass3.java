package Java101.Subjects.Intro;

import java.util.Arrays;

public class ArrayClass3 {
    public static void main(String[] args) {
        int [] num1 = {-5, -3, 7, 65, 42, -4};
        int [] num2 = {-5, -3, 7, 65, 42, -4};
        int [] num3 = {21, 12, 63545, -59, 42};
        System.out.println(num1 == num2); // this is false because 7 in num1 has different address from num3 in memory.
        System.out.println(Arrays.equals(num1,num2)); // this code queries that if num1 and num2 has same value in same index or not.
                                                      // does not query addresses.
        System.out.println(Arrays.equals(num1,num3));
        // Same way can be used for strings, chars, doubles...
        // Also .equals can be used for objects.
        String str1 = "hello";
        String str2 = "hello";
        System.out.println("\n");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

    }
}
