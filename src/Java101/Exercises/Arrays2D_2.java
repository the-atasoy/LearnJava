package Java101.Exercises;

import java.util.Random;

public class Arrays2D_2 {
    public static int[][] getArray(){
        Random rand = new Random();
        int [][] nums = new int[rand.nextInt(6)][rand.nextInt(6)];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = rand.nextInt(1001);
            }
        }
        return nums;
    }

    public static void greatest(int[][] x){
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length-1; j++){
                if (x[i][j]>x[i][j+1]){
                    x[i][j+1] = x[i][j];
                }
                if (j == (x[i].length) - 2){
                    System.out.println("The greatest number of " + (i+1) + ". row is " + x[i][j+1] + ".");
                }
            }
        }

    }

    public static void main(String[] args) {
        greatest(getArray());
    }
}
