public class arr16 {
     public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 1};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "Sorted in descending order" : "Not sorted");
    }
}
