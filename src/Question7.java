import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //Element Search in Array:
        //
        //Task: Write a Java program to search for a specific integer in an array and print its index if found.
        //Sample Input: Array: [4, 8, 15, 16, 23, 42], Search Element: 16
        //Sample Output: Element 16 found at index 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Store user input in the array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1));
            int input = scanner.nextInt();
            array[i] = input; // Assign input to array[i]
        }

        // Check if each element is 16
        for (int i = 0; i < size; i++) {
            if (array[i] == 16) {
                System.out.println("Element 16 found at index " + i);
            }
        }
    }
}
