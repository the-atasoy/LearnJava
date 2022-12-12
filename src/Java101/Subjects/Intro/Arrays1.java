package Java101.Subjects.Intro;

public class Arrays1 {
    public static void main(String[] args) {
        int numbers [] = new int[5];
        numbers [0] = 7;
        numbers [3] = 4;
        numbers [4] = 10;

        double nums [] = {1.9, 1.7, 2.5, 4};

        System.out.println(nums); // This code prints address of the array.
        // You need to write like below.

        for (int i = 0; i <= nums.length - 1; i++){

            System.out.println(nums[i]);

        }

    }
}
