public class arr21 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 1, 6};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x < min) {
                secondMin = min;
                min = x;
            } else if (x < secondMin && x != min) {
                secondMin = x;
            }
        }
        System.out.println("Second minimum = " + secondMin);
    }
}
