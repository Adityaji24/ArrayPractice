
public class Question9 {
    public static void main(String[] args) {
        //Sum of Even Elements:
        //
        //Task: Write a Java program to find the sum of all even numbers in an integer array.
        //Sample Input: [1, 2, 3, 4, 5, 6, 7, 8]
        //Sample Output: Sum of even elements = 20
        int[]array={1,2,3,4,5,6,7,8};
        int sum=0;
        for (int i =0; i <array.length ; i++) {
            if(array[i]%2==0){
                sum=sum+array[i];
            }

        }
        System.out.println("sum of even elements= " + sum);

    }
}
