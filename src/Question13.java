public class Question13 {
    public static void main(String[] args) {
        //Array of Floating-point Numbers:
        //
        //Task: Create a float array of size 4, initialize it with values, and write a program to print the array.
        //Sample Input: [1.1f, 2.2f, 3.3f, 4.4f]
        //Sample Output: [1.1, 2.2, 3.3, 4.4]
        float[] array = new float[4];
        array[0] = 1.1f;
        array[1] = 2.2f;
        array[2] = 3.3f;
        array[3] = 4.4f;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

