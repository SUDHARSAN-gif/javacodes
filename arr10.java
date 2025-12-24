public class arr10 {
   public static void main(String[] args) {
        int[] arr = {1, -2, 3, -5, 4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    } 
}
