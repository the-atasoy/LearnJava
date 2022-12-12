package Java101.Subjects.Intro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("orange");
        colors.add("green");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(8);
        nums.add(41);
        nums.add(0);
        nums.add(19);

        for (int i = 0; i < colors.size(); i++){
            System.out.print(colors.get(i) + " ");
        }
        System.out.println("\n");
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        Collections.sort(colors);
        System.out.println(colors);

    }
}
