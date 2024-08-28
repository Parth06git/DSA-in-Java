import java.util.Arrays;

public class Main {

    // Question - 1
    void spOfArray(int[] arr) { // O(N) - TC
        int sum = 0;
        int product = 1;
        for (int value : arr) {
            sum += value;
            product *= value;
        }
        System.out.println("Sum of the array is " + sum);
        System.out.println("Product of the array is " + product);
    }

    // Question - 2
    void printPair(int[] arr) { // O(N²) - TC
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + "," + arr[j]);
            }
        }
    }

    // Question - 3
    void reverseArray(int[] arr) { // O(N) - TC
        for (int i = 0; i < arr.length / 2; i++) {
            int replace = arr.length - i - 1;
            int temp = arr[i];
            arr[i] = arr[replace];
            arr[replace] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] customArray = { 1, 5, 3, 4, 8 };
        main.spOfArray(customArray);
        main.printPair(customArray);
        main.reverseArray(customArray);
    }
}
