import java.util.*;

public class max_minArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // Input for "size"

        int number[] = new int[size]; // Array defined

        // Input
        for (int i = 0; i < size; i++) { // Use '<' instead of '<=' to loop through the array
            number[i] = sc.nextInt(); // Input for "i"
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE; // Initialize min with Integer.MAX_VALUE

        // Output
        for (int i = 0; i < size; i++) { // Use '<' instead of '<=' to loop through the array
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }

        // Print the maximum and minimum values
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
