package Java101.Subjects.Intro;

import java.util.Arrays;

public class ArrayClass2 {
    public static void main(String[] args) {

        int[] numbers = {-5, 7, 42, 0, 155};
    Arrays.sort(numbers);
        for (int i = 0; i<=numbers.length-1; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("\n\n" + Arrays.binarySearch(numbers,7)); // 7 kaçıncı indexte
        System.out.println(Arrays.binarySearch(numbers,45)); // 45 arrayde yok, eklenirse 4. indexte bulunur
                                                                 // -(4+1) = -5, bu kod verir. Yani arrayin 5. sayısı olur.
    }
}


