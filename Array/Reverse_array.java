public class Reverse_array {
    public static void main(String[] args) {
        // int arr[]={1,2,3};
        int arr[]={4,5,1,2};
        int n=arr.length-1;
        for(int i=n;i>=0;i--)
        {
            // int temp=arr[i];
            // arr[i]=arr[n-i];
            // arr[n-i]=temp;

            System.out.print(arr[i]+"  ");
        }
    }
}
