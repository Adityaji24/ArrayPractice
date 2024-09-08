public class Question1 {
    public static void main(String[] args) {
        //Integer Array Initialization:
        //
        //Task: Create an integer array of size 5 and initialize it with the values 10, 20, 30, 40, and 50.
        //Sample Input: None (initialize directly).
        //Sample Output: [10, 20, 30, 40, 50]
        int[]array=new int[5];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        System.out.print("array elements are = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}


