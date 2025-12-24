import java.util.HashSet;
public class arr47 {
    public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr)
            set.add(x);
        int longest = 0;
        for (int x : arr) {
            if (!set.contains(x - 1)) {
                int curr = x;
                int count = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println("Longest consecutive sequence length = " + longest);
    }
}
}
