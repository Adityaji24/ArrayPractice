public class Question6 {
    public static void main(String[] args) {
        //Task: Create a program to reverse the elements in a character array and print the reversed array.
        //Sample Input: ['a', 'b', 'c', 'd', 'e']
        //Sample Output: ['e', 'd', 'c', 'b', 'a']

        // Initialize the character array directly
        char[] array = {'a', 'b', 'c', 'd', 'e'};

        // Print the original array
        System.out.println("Original Array: ");
        for (char c : array) {
            System.out.print(c + " ");
        }

        // Reverse the array
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        // Print the reversed array
        System.out.println("\nReversed Array: ");
        for (char c : array) {
            System.out.print(c + " ");
        }
    }
}


