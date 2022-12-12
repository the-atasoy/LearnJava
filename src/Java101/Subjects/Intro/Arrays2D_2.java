package Java101.Subjects.Intro;

import java.util.Arrays;

public class Arrays2D_2 {
    public static void main(String[] args) {

        // printing two-dimensional arrays row by row.

        int[][] integers = {{3, 5, 7}, {10, 2, 9}};

        for (int i = 0; i< integers.length; i++){
            for (int j = 0; j<3; j++){
                System.out.print(integers[i][j] + " ");
            }
            System.out.println();
        }


        //------------------------------------------------------------------------------------

        System.out.println("\n\n");

        // printing two-dimensional arrays column by column.

        int[][] int2 = {
                  {4,6,9},
                  {12,1,0}
        };
        for (int i = 0; i<=2; i++){
            for (int j = 0; j<=1; j++){
                System.out.print(int2[j][i] + " ");
            }
            System.out.println();
        }




        System.out.println("\n\n");
        System.out.println(Arrays.toString(int2)); // prints place of the array in memory.
        System.out.println(Arrays.toString(int2[0]));
        System.out.println(Arrays.deepToString(int2));

    }
}
