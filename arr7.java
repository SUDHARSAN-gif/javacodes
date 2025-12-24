public class arr7 {
     public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 0};
        int count = 0;
        for (int x : arr) {
            if (x == 0) {
                count++;
            }
        }
        System.out.println("Number of zeroes = " + count);
    }
}
