public class Question15 {
    public static void main(String[] args) {
        //Sum of Odd Elements:
        //
        //Task: Write a Java program to calculate the sum of all odd numbers in an integer array.
        //Sample Input: [1, 2, 3, 4, 5, 6, 7, 8]
        //Sample Output: Sum of odd elements = 16
        int[]array={1,2,3,4,5,6,7,8};
        int sum=0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]%2==1){
                sum=sum+array[i];
            }

        }
        System.out.println("sum of odd elements= " + sum);

    }
}
