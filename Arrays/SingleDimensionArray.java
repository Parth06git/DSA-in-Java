package Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfAray) { // O(N) - TC && O(N) - SC
        arr = new int[sizeOfAray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Inserting values
    public void insert(int location, int value) { // O(1) - TC && O(1) - SC
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Value is inserted");
            } else {
                System.err.println("Loaction is already filled");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid Index to access array");
        }
    }

    // Array Traversal
    public void traverseArray() { // O(N) - TC && O(1) - SC
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.err.println("Array no longer exist");
        }
    }

    // Search an element
    public void searchInArray(int value) { // O(N) - TC && O(1) - SC
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Index of the " + value + " is " + i);
                return;
            }
        }
        System.err.println(value + " is not present in the array");
    }

    // Deleting an element
    public void deleteValue(int Index) { // O(1) - TS && O(1) - SC
        try {
            arr[Index] = Integer.MIN_VALUE;
            System.out.println("The value is deleted successfully");
        } catch (Exception e) {
            System.err.println("Invalid Index to access array");
        }
    }
}
