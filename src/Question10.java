public class Question10 {
    public static void main(String[] args) {
        //Count Occurrences of an Element:
        //
        //Task: Write a program to count the number of times a specific character appears in a character array.
        //Sample Input: Array: ['a', 'b', 'a', 'c', 'a', 'd'], Character to count: 'a'
        //Sample Output: 'a' occurs 3 times
        char[]array={'a','b','a','c','a','d'};
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]=='a'){
                count++;
            }
        }
        System.out.println();
        System.out.println("'a' occurs"+" "+count+" "+"times");
    }
}
