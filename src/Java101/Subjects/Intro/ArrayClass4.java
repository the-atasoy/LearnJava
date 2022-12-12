package Java101.Subjects.Intro;

import java.util.Arrays;

public class ArrayClass4 {
    public static void main(String[] args) {


        int[] nums1 = new int[8]; // {0,0,0,0,0,0,0,0}
        Arrays.fill(nums1, 5); // {5,5,5,5,5,5,5,5}
        Arrays.fill(nums1, 3, 7, 2); // {0,0,0,2,2,2,2,0}

    }
}
