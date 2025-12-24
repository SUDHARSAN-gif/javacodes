import java.util.HashSet;
public class arr49 {
    public static void main(String[] args) {
        int[] arr={1,2,4,6};
        HashSet<Integer>set=new HashSet<>();
        int max=0;
        for (int x:arr) {
            if (x>0) {
                set.add(x);
                max=Math.max(max,x);
            }
        }
        for (int i=max;i>=1;i--) {
            if (!set.contains(i)) {
                System.out.println("Largest missing positive="+i);
                return;
            }
        }
        System.out.println("No missing positive number");
    }
}
