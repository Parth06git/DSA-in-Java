package Arrays;

public class TwoDimensionArray {
    int arr[][] = null;

    public TwoDimensionArray(int NumberOfRow, int NumberOfCol) { // O(NM) - STC
        arr = new int[NumberOfRow][NumberOfCol];
        for (int i = 0; i < NumberOfRow; i++) {
            for (int j = 0; j < NumberOfCol; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting Value
    public void insert(int row, int col, int value) { // O(1) - STC
        if (arr[row][col] == Integer.MIN_VALUE) {
            arr[row][col] = value;
            System.out.println("Value is inserted");
        } else {
            System.err.println("Place is already occupied");
        }
    }

    // Accessing a cell
    public void accessCell(int row, int col) { // O(1) - STC
        System.out.println("Accessing row: " + row + " col: " + col);
        System.out.println("Cell value: " + arr[row][col]);
    }

    // Array Traversal
    public void traverseArray() { // O(NM) - TC && O(1) - SC
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Searching value in Array
    public void searchInArray(int value) { // O(MN) - TC && O(1) - SC
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == value) {
                    System.out.println("Row and col of the " + value + " respectively are " + i + " & " + j);
                    return;
                }
            }
        }
        System.err.println(value + " is not present in the array");
    }

    // Deleting a cell
    public void deleteCell(int row, int col) { // O(1) - STC
        try {
            if (arr[row][col] != Integer.MIN_VALUE) {
                arr[row][col] = Integer.MIN_VALUE;
                System.out.println("The value is deleted successfully");
            } else {
                System.err.println("Cell is already empty");
            }
        } catch (Exception e) {
            System.err.println("Invalid Index to access array");
        }
    }

}
