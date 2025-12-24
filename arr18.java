public class arr18 {
   public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Maximum element = " + max);
    } 
}
