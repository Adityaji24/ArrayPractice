import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //Average of Array Elements:
        //
        //Task: Create a float array of size 7. Write a program to calculate the average of the elements in the array.
        //Sample Input: [1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f]
        //Sample Output: Average = 4.7857143
        Scanner scanner = new Scanner(System.in);


        // Create a float array of the specified size
        float[] array = new float[7];

        // Get the array elements from the user
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextFloat();
        }

        // Calculate the sum of array elements
        float sum = 0;
        for (float num : array) {
            sum += num;
        }

        // Calculate the average
        float average = sum / array.length;

        // Print the average
        System.out.println("Average = " + average);
    }
}
