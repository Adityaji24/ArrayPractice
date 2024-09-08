import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
       //Sum of Array Elements:
        //
        //Task: Write a program to calculate the sum of all elements in an integer array of size 10.
        //Sample Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //Sample Output: Sum = 55
        Scanner scanner=new Scanner(System.in);
         int sum=0;
        int[]array=new int[10];
        for (int i = 1; i <=array.length ; i++) {
            System.out.println("Enter element"+i);
            int input= scanner.nextInt();
            sum=sum+i;
        }
        System.out.println("sum of all elements= " + sum);
    }
}
