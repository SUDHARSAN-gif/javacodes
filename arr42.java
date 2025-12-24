public class arr42 {
   public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 3, 1};
        int maxCount = 0;
        int element = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                element = arr[i];
            }
        }
        System.out.println("Most repeated element = " + element);
    } 
}
