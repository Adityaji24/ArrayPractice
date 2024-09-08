public class Question14 {
    public static void main(String[] args) {
        //Check for Duplicates:
        //
        //Task: Write a program to check if there are any duplicate elements in an integer array.
        //Sample Input: [7, 3, 9, 2, 3, 8]
        //Sample Output: Duplicate found: 3
        int[] array = {7, 3, 9, 2, 3, 8};

        boolean duplicateFound = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate found: " + array[i]);
                    duplicateFound = true;
                        }
                    }
                }

                if (!duplicateFound) {
                    System.out.println("No duplicates found");
                }}}

