public class arr50 {
      public static void main(String[] args) {
        int[] a={1, 3};
        int[] b={2, 4};
        int n=a.length+b.length;
        int[] merged=new int[n];
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length) {
            if (a[i]<b[j])
                merged[k++]=a[i++];
            else
                merged[k++]=b[j++];
        }
        while (i<a.length)
            merged[k++]=a[i++];
        while (j<b.length)
            merged[k++]=b[j++];
        if (n%2==0)
            System.out.println("Median="+
                    (merged[n/2-1]+merged[n/2])/2.0);
        else
            System.out.println("Median="+merged[n/2]);
    }
}
