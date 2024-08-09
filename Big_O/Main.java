package Big_O;

class Main {

    // Time Complexity

    // O(1)
    static void squareNumber(int n) {
        System.out.println(n * n);
    }

    // O(N)
    static void printNumber(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // O(N²)
    static void printNumber1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    // Adding time complexity
    static void showNumber(int a, int b) { // O(a + b)
        for (int i = 0; i < a; i++) { // O(a)
            System.out.println(i);
        }

        for (int i = 0; i < b; i++) { // O(b)
            System.out.println(i);
        }
    }

    // Multiplying time complexity
    static void showNumber1(int a, int b) { // O(a * b)
        for (int i = 0; i < a; i++) { // O(a)
            for (int j = 0; j < b; j++) { // O(b)
                System.out.println(i + " " + j);
            }
        }
    }

    // Space Complexity

    // O(1)
    static int pairSumSequence(int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += pairSum(i, i + 1); // Use and delete previous value of pairSum
        }
        return total;
    }

    static int pairSum(int a, int b) {
        return a + b;
    }

    // O(N)
    static int sumNumber(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sumNumber(n - 1); // Had to store previous value of sumNumber
    }

    public static void main(String[] args) {
        squareNumber(4);
        printNumber(6);
        printNumber1(2);
        System.out.println(sumNumber(5));
        System.out.println(pairSumSequence(4));
    }

}
