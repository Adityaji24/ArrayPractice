public class Question17 {
    public static void main(String[] args) {
        int[] array = {12, -5, 0, 8, 3};

        int smallestPositive = Integer.MAX_VALUE; // Initialize with max value

        for (int num : array) {
            if (num > 0 && num < smallestPositive) {
                smallestPositive = num;
            }
        }

        if (smallestPositive == Integer.MAX_VALUE) {
            System.out.println("No positive numbers found");
        } else {
            System.out.println("Smallest positive number = " + smallestPositive);
        }
    }

}
