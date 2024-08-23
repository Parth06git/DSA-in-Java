package Arrays.Project;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many days temperature?");
        int days = console.nextInt();
        int[] temps = new int[days];
        int sum = 0;

        for (int i = 0; i < days; i++) {
            System.out.println("Max Temp of " + (i + 1) + " day?");
            temps[i] = console.nextInt();
            sum += temps[i];
        }

        double avgTemp = sum / days;
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] >= avgTemp) {
                count++;
            }
        }

        System.out.println("Average Temperature: " + avgTemp);
        System.out.println("Days above Average Temperature: " + count);

        console.close();
    }
}
