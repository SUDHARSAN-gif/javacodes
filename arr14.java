public class arr14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0)
                left++;
            while (left < right && arr[right] % 2 != 0)
                right--;
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
