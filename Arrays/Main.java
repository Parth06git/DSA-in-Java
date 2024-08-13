package Arrays;

// import java.util.Arrays;

class Main {
    public static void main(String[] args) {

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

        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 15);
        sda.insert(1, 9);
        sda.insert(1, 5);
        sda.insert(12, 30);

        // var firstElement = sda.arr[0];
        // System.out.println(firstElement);

        // sda.traverseArray();
        // sda.searchInArray(9);
        sda.deleteValue(1);
    }
}
