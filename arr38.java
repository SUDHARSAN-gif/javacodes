public class arr38 {
    public static void main(String[] args) {
        int[] arr={1,4,20,3,10,5};
        int sum=33;
        int currSum=0,start=0;
        for (int end=0;end<arr.length;end++) {
            currSum+=arr[end];
            while (currSum > sum) {
                currSum-=arr[start++];
            }
            if (currSum==sum) {
                System.out.println("Subarray found from"+start+"to"+end);
                return;
            }
        }
        System.out.println("No subarray found");
    } 
}
