package Java101.Subjects.Intro;

// Arraylists are arrays but you can resize them.

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

    public static void main(String[] args) {

        // Creating an ArrayList

        ArrayList<Integer/* not int, it is an object. */> integers;
        integers = new ArrayList<>();

        ArrayList<String/* not primitive*/> fruit = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();

        // 1) Adding item in an ArrayList

        fruit.add("banana");
        fruit.add("apple");
        fruit.add("cherry");
        System.out.println(fruit);
        fruit.add(0, "atIndex 0");
        System.out.println(fruit);
        fruit.add(2, "atIndex 2");
        System.out.println(fruit + "\n");

        // 2) Accessing an item of an ArrayList

        System.out.println(fruit.get(0));
        System.out.println(fruit.get(3) + "\n");

        // 3) Change an item of an ArrayList

        fruit.set(2, "melon"); // this index (2. index) is not 'atIndex 2' anymore, it is melon now.
        System.out.println(fruit.get(2) + "\n");

        // 4) Removing an item of an ArrayList

        fruit.remove(2); // You can remove item in 2. index of ArrayList.
        System.out.println(fruit);
        fruit.remove("banana"); // this code removes banana from ArrayList.
        System.out.println(fruit);
        fruit.clear(); // this code removes every item of Arraylist.
        System.out.println(fruit + "\n");

        // 5) Getting size of an ArrayList

        System.out.println(fruit.size());
        fruit.add("watermelon");
        fruit.add("strawberry");
        System.out.println(fruit.size());
    }
}
