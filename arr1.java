import java.util.Scanner;
public class arr1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements: ");
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
}