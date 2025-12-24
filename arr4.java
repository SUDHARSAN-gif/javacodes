public class arr4 {
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int sum = 0;

        for (int x : arr) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println("Sum of even numbers = " + sum);
    }
}
