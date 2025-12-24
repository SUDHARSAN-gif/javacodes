public class arr34 {
    public static void main(String[] args) {
        int[] arr={1, 2, 2, 2, 3};
        int key=2;
        int first=-1,last=-1;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==key) {
                if (first==-1)
                    first=i;
                last=i;
            }
        }
        System.out.println("First=" + first);
        System.out.println("Last=" + last);
    }
}
