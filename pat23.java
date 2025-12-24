//Q23.Write a Java program to print Pascal’s Triangle.
public class pat23 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int s = n - i; s > 0; s--)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
