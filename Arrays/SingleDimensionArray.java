package Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfAray) {
        arr = new int[sizeOfAray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) { // O(1)
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
}
