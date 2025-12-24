public class arr17 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean distinct = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    distinct = false;
                    break;
                }
            }
        }
        System.out.println(distinct ? "All elements are distinct" : "Not distinct");
    }
}
