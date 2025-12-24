public class arr37 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k, n-1);
        reverse(arr,0,n-1);
        for (int x : arr)
            System.out.print(x+" ");
    }
    static void reverse(int[] arr,int l,int r) {
        while (l<r) {
            int temp=arr[l];
            arr[l++]=arr[r];
            arr[r--]=temp;
        }
    }
}
