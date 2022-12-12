package Java101.Subjects.Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachLoop { // for each loop is used to accessing arrays or array lists without using indexes.

    public static void main(String[] args) {

        ArrayList<String> itemsArrayList = new ArrayList<>();

        itemsArrayList.add("item1");
        itemsArrayList.add("item2");
        itemsArrayList.add("item3");
        itemsArrayList.add("item4");

        for(String item : itemsArrayList){
            System.out.print(item + " ");
        }

        System.out.println("\n");

        int[] nums = {12,41,2};

        for (int array : nums){
            System.out.print(array + " ");
        }

        System.out.println("\n");

        // Challenge

        int[] arr = {5, 2, 2, 0};

        int i = 0;
        for (int item : arr){
            System.out.println(item + " " +i++);
        }
    }

}
