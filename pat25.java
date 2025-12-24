//Q25.Write a Java program to print a reverse alphabet palindrome pyramid.
public class pat25 {
     public static void main(String[] args) {
        int n=4;
        for (int i=0;i<n;i++) {
            for (int s=n-i;s>0;s--)
                System.out.print(" ");
            for (char ch=(char) ('A'+n-1);ch>='A'+n-1-i;ch--)
                System.out.print(ch);
            for (char ch=(char) ('A'+n-i);ch<='A'+n-1;ch++)
                System.out.print(ch);
            System.out.println();
        }
    }
}
