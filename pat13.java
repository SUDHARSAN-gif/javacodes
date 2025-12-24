//Q13.Write a Java program to print a reverse full pyramid pattern.
public class pat13 {
     public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int s = n - i; s > 0; s--)
                System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
