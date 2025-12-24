import java.util.Arrays;
public class arr22 {
    public class KthMaximum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        int k = 2;

        Arrays.sort(arr);
        System.out.println("Kth maximum = " + arr[arr.length - k]);
    }
}
}