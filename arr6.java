public class arr6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8};
        int count = 0;
        for (int x : arr) {
            if (x % 2 != 0) {
                count++;
            }
        }
        System.out.println("Number of odd elements = " + count);
    }
}
