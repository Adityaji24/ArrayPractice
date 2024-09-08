public class Question11 {
    public static void main(String[] args) {
        //Find Second Largest Element:
        //
        //Task: Write a program to find the second-largest element in an integer array.
        //Sample Input: [15, 22, 8, 19, 31]
        //Sample Output: Second Largest Element = 22
        int[] array = {15, 22, 8, 19, 31};

        // Initialize max and secondMax variables
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Iterate over the array
        for (int num : array) {
            // Check if current number is greater than max
            if (num > max) {
                // Update secondMax and max
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                // Update secondMax
                secondMax = num;
            }
        }

        // Print the second-largest element
        System.out.println("Second Largest Element = " + secondMax);
    }
}


