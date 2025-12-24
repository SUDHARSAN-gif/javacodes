public class arr19 {
     public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Minimum element = " + min);
    }
}
