//Q21.Write a Java program to print a Zig-Zag pattern.
public class pat21 {
     public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
