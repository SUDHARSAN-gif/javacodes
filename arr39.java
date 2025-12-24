public class arr39 {
     public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1};
        int sum=3;
        int maxLen=0;
        for (int i=0;i<arr.length;i++) {
            int currSum=0;
            for (int j=i;j<arr.length;j++) {
                currSum+=arr[j];
                if (currSum==sum)
                    maxLen=Math.max(maxLen,j-i+1);
            }
        }
        System.out.println("Maximum length="+maxLen);
    }
}
