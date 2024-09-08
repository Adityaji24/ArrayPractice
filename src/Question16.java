import java.util.Scanner;
public class Question16 {
    public static void main(String[] args) {
        //Replace Elements in an Array:
        //
        //Task: Write a program to replace all occurrences of a specific integer in an array with another integer.
        //Sample Input: Array: [4, 5, 6, 4, 7], Replace 4 with 9
        //Sample Output: [9, 5, 6, 9, 7]
        Scanner scanner = new Scanner(System.in);

        // Get the array size from the user
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        // Get the array elements from the user
        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Get the integer to replace and its replacement from the user
        System.out.print("Enter the integer to replace: ");
        int replace = scanner.nextInt();
        System.out.print("Enter the replacement integer: ");
        int replacement = scanner.nextInt();

        // Replace all occurrences of the integer
        for (int i = 0; i < size; i++) {
            if (array[i] == replace) {
                array[i] = replacement;
            }
        }

        // Print the modified array
        System.out.println("Modified array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}


