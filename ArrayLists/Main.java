package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // ArrayList<Type> arraylistName = new ArrayList<Type>(Intenal array size) -
        // default value of internal array size is 10. Eg:-
        // ArrayList names = new ArrayList() - not data safe type array list
        // ArrayList<String> names = new ArrayList<String>(15)

        ArrayList<Integer> numbers = new ArrayList<Integer>(12); // O(1) - TC && O(N) - SC
        numbers.add(15); // O(1) - STC
        numbers.add(16);
        numbers.add(257);
        numbers.add(1, 350); // O(N) - TC && O(1) - SC
        System.out.println(numbers);

        // Accessing arraylist
        System.out.println(numbers.get(3));

        // Traversal of arraylist

        // Method-1
        // for (int i = 0; i < numbers.size(); i++) { // O(N) - TC && O(1) - SC
        // System.out.println(numbers.get(i));
        // }

        // Method-2
        // for (Integer num : numbers) { // O(N) - TC && O(1) - SC
        // System.out.println(num);
        // }

        // Method-3
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) { // O(N) - TC && O(1) - SC
            int num = iterator.next();
            System.out.println(num);
        }

        // Searching a element in arraylist

        // Method-1
        // for (Integer num : numbers) { // O(N) - TC && O(1) - SC
        // if (num.equals(257)) {
        // System.out.println("Element found!");
        // break;
        // }
        // }

        // Method-2 (indexOf)
        int index = numbers.indexOf(27); // O(N) - TC && O(1) - SC
        if (index == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index: " + index);
        }

        // Deleting an element
        numbers.remove(2); // O(N) - TC && O(1) - SC
        System.out.println(numbers);

        ArrayList<String> strList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
        strList.remove("B");
        System.out.println(strList);
    }

}
