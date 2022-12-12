package ESTU.Assignments;

public class SortByHeight {
    public static String[] sortByHeight(String[] names, int[] heights) {

        int temp;
        String temp2;

        for (int i = heights.length - 1; i > 0; i--) {

            if (heights[i] > heights[i - 1]) {

                temp = heights[i];
                heights[i] = heights[i - 1];
                heights[i -1] = temp;

                temp2 = names[i];
                names[i] = names[i - 1];
                names[i - 1] = temp2;

                i = heights.length;
            }

        }
        return names;
    }

    public static void main(String[] args) {
        String[] names = {"Gizem", "Ozan", "Ege", "Meral"};
        int[] heights = {173, 171, 178, 166};

        for (int i = 0; i < names.length; i++){
            System.out.println(sortByHeight(names, heights)[i]);
        }


    }
}
