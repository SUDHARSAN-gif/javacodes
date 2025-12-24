public class arr29 {
     public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index] < 0) {
                System.out.println("Duplicate number = " + index);
                return;
            }
            arr[index] = -arr[index];
        }
    } 
}
