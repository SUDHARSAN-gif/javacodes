public class arr20 {
     public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                secondMax = max;
                max = x;
            } else if (x > secondMax && x != max) {
                secondMax = x;
            }
        }
        System.out.println("Second maximum = " + secondMax);
    }
}
