public class arr43 {
     public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int count = 0, candidate = 0;
        for (int x : arr) {
            if (count == 0) {
                candidate = x;
                count = 1;
            } else if (x == candidate) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println("Majority element = " + candidate);
    }
}
