import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        //Task: Write a Java program to find the minimum value in a double array.
        //Sample Input: [2.5, 3.8, 1.9, 5.6, 4.3]
        //Sample Output: Minimum Element = 1.9
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=scanner.nextInt();
        double[]array=new double[size];
        for (int i = 1; i <= size; i++) {
            System.out.println("Enter element " + i);
            double input = scanner.nextDouble();
            array[i - 1] = input;
        }

        // Find the minimum element
        double min = array[0]; // Initialize min with the first element
        for (int i = 1; i < size; i++) {
            if (array[i]< min) {
                min = array[i];
            }
        }

        // Print the minimum element
        System.out.println("Minimum element = " + min);
    }
}

