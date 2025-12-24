public class arr8 {
     public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;
        for (int x : arr) {
            if (x != 0) {
                arr[index++] = x;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
