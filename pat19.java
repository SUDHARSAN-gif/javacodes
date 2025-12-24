//Q19.Write a Java program to print an hour glass pattern.
public class pat19 {
     public static void main(String[] args) {
        int n = 3;
        for (int i = n; i >= 1; i--) {
            for (int s = n - i; s > 0; s--)
                System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int s = n - i; s > 0; s--)
                System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
