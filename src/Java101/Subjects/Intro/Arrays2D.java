package Java101.Subjects.Intro;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] numbers = new int[2/*number of row*/][2/*number of column*/];
        // numbers = [[0,0],[0,0]]
        numbers[0][0] = 3;
        numbers[0][1] = 5;
        numbers[1][0] = 4;
        numbers[1][1] = 16;
        // numbers = [[3,5],[4,16]]
        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);
        System.out.println(numbers[1][0]);
        System.out.println(numbers[1][1]);
    }

    // int[] numbers = { {3,5}, {4,16} } this way can be used instead of above.
}
