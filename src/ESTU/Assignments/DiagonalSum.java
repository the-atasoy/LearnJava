package ESTU.Assignments;

public class DiagonalSum {

    public static int getRandomSize(){
        return (int)(Math.random() * 10) + 1;
    }

    public static int[][] generateMatrix(int n){
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 20) + 1;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int computeSum(int[][] matrix){
        int sum = 0;

        for (int i = 0; i < matrix.length && matrix.length != 1; i++) {
            // if length of matrix is an odd number, middle value of matrix should be calculated once.
            if(matrix.length % 2 != 0 && i == (matrix.length / 2)){
                i++;
            }
                sum += matrix[i][i];
        }

        for (int i = 0, j = matrix.length - 1; i < matrix.length && j >= 0; i++, j--) {
            sum += matrix[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {

        int randomSize = getRandomSize();
        int[][] matrix = generateMatrix(randomSize);
        printMatrix(matrix);
        System.out.println("\n");
        System.out.println("Sum of left and right diagonals is " + computeSum(matrix) + ".");

    }
}
