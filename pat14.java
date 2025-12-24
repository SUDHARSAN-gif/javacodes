//Q14.Write a Java program to print a diamond pattern.
public class pat14 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--)
                System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n - i; s > 0; s--)
                System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
