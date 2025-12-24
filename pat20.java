//Q20.Write a Java program to print a hollow hour glass pattern.
public class pat20 {
     public static void main(String[] args) {
        int n = 3;
        for (int i = n; i >= 1; i--) {
            for (int s = n - i; s > 0; s--)
                System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n || j == 1 || j == 2 * i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int s = n - i; s > 0; s--)
                System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n || j == 1 || j == 2 * i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
