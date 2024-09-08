import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Find Maximum Element:
        //
        //Task: Given an integer array, write a program to find and print the maximum element in the array.
        //Sample Input: [5, 12, 3, 19, 7, 26, 14]
        //Sample Output: Maximum Element = 26
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Store user input in the array
        for (int i = 1; i <= size; i++) {
            System.out.println("Enter element " + i);
            int input = scanner.nextInt();
            array[i - 1] = input;
        }

        // Find the maximum element
        int max = array[0]; // Initialize max with the first element
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Print the maximum element
        System.out.println("Maximum element = " + max);
    }
}
