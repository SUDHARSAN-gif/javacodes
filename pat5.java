//Q5.Write a Java program to print a reverse right angle triangle pattern.
public class pat5 {
      public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
