public class arr3 {
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        System.out.print("Running sum: ");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(sum + " ");
        }
    }
}
