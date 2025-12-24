//Q6.Write a Java program to print a left angle triangle pattern.
public class pat6 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++) {
            for (int s=n-i;s>0;s--)
                System.out.print("  ");
            for (int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

