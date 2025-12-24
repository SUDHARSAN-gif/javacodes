public class arr28 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("First non-repeated = " + arr[i]);
                return;
            }
        }
    }
}
