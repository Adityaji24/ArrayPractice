public class Question18 {
    public static void main(String[] args) {
        //Product of Array Elements:
        //
        //Task: Write a Java program to find the product of all elements in a double array.
        //Sample Input: [1.5, 2.0, 3.5]
        //Sample Output: Product = 10.5
        double[]array={1.5,2.0,3.5};
        double mult=1.0;
        for (int i = 0; i < array.length ; i++) {
            mult=mult*array[i];

        }
        System.out.println("Product = " + mult);
    }

}
