package Java101.Exercises;

public class Arrays2D_1 {
    public static int[][] getArray(){
        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        return array;
    }

    public static void sum(int[][] integers){
        int sumRow = 0;
        int sumColumn = 0;
        for (int i = 0; i < integers.length; i++){
            for (int j = 0; j < integers[i].length; j++){
                sumRow += integers[i][j];
            }
            System.out.println("Sum of " + (i+1) + ". row of array is " + sumRow + ".");
        }

        System.out.println("\n");

        for (int i = 0; i < integers.length; i++){
            for (int j = 0; j < integers.length; j++){
                sumColumn += integers[j][i];
            }
            System.out.println("Sum of " + (i+1) + ". column of array is " + sumColumn + ".");
        }
    }

    public static void main(String[] args) {
        sum(getArray());
    }
}
