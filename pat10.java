//Q10.Write a Java program to print a reverse hollow pyramid pattern.
public class pat10 {
     public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--) {
            for (int s=n-i;s>0;s--)
                System.out.print("  ");
            for (int j=1;j<=2*i-1;j++) {
                if (i==n||j==1||j==2*i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
