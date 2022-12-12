package Java101.Subjects.Intro;

public class Arrays2D_3 {

    public static int[][] getArray(){
        return new int[][] { {1, 2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11} };
    }

    public static void printArray(int[][] integers){
        for (int i = 0; i < integers.length; i++){
            for (int j = 0; j < integers[i].length; j++){
                System.out.print(integers[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printArray(getArray());
    }
}
