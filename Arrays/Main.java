package Arrays;

// import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        // 1D Array

        /*
         * Three Steps of creating an array isolated
         * int[] arr; // O(1)
         * arr = new int[3]; // O(1)
         * for (int i = 0; i < arr.length; i++) { // O(N)
         * arr[i] = i + 1;
         * }
         */

        // All steps together
        // String sArr[] = { "a", "b", "c" }; // O(1)
        // System.out.println(Arrays.toString(sArr));

        // SingleDimensionArray sda = new SingleDimensionArray(10);
        // sda.insert(0, 15);
        // sda.insert(1, 9);
        // sda.insert(1, 5);
        // sda.insert(12, 30);

        // var firstElement = sda.arr[0];
        // System.out.println(firstElement);

        // sda.traverseArray();
        // sda.searchInArray(9);
        // sda.deleteValue(1);

        // 2D Array

        // int[][] tdarr;
        // tdarr = new int[2][2];
        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < 2; j++) {
        // tdarr[i][j] = i + j;
        // }
        // }
        // String tdarr[][] = { { "a", "b" }, { "c", "d" } };
        // System.out.println(Arrays.deepToString(tdarr));

        TwoDimensionArray tda = new TwoDimensionArray(2, 3);
        tda.insert(0, 2, 15);
        tda.insert(0, 0, 21);
        tda.insert(1, 1, 1);
        // System.out.println(Arrays.deepToString(tda.arr));
        tda.accessCell(0, 2);
        tda.traverseArray();
        tda.searchInArray(5);
        tda.deleteCell(0, 1);
    }
}
