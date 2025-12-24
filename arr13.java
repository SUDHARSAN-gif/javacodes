public class arr13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5};
        boolean hasDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
        }
        System.out.println(hasDuplicate ? "Contains duplicates" : "No duplicates");
    } 
}
