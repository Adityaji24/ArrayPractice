public class Question8 {
    public static void main(String[] args) {
        //Copying Arrays:
        //
        //Task: Create two integer arrays of size 5. Write a program to copy the elements of the first array into the second array.
        //Sample Input: First Array: [1, 2, 3, 4, 5]
        //Sample Output: Second Array: [1, 2, 3, 4, 5]
        // Initialize the first array
        int[] firstArray = {1, 2, 3, 4, 5};

        // Create a second array of the same size
        int[] secondArray = new int[firstArray.length];

        // Copy elements from the first array to the second array
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }

        // Print the second array
        System.out.println("Second Array: ");
        for (int element : secondArray) {
            System.out.print(element + " ");
        }
    }
}




