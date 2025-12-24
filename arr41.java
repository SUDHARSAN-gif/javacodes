public class arr41 {
     public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        int maxProd = arr[0];
        int minProd = arr[0];
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = maxProd;
            maxProd = Math.max(arr[i], Math.max(maxProd * arr[i], minProd * arr[i]));
            minProd = Math.min(arr[i], Math.min(temp * arr[i], minProd * arr[i]));
            result = Math.max(result, maxProd);
        }
        System.out.println("Maximum product subarray = " + result);
    }
}
