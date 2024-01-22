import java.util.Arrays;

class Median {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int[] nums1 = {1,2};
        int[] nums2 = {45,26,3,4};
        int m=nums1.length;
        int n=nums2.length;
        double []arr=new double [m+n];
        int l=arr.length;
        int p=0;
        for(int i=0;i<l;i++)
        {
            if(i<m)
            {
                arr[i]=nums1[i];
            }
            else{
                arr[i]=nums2[p];
                p++;
            }
        }
        Arrays.sort(arr);
        for(double j:arr)
        {
            System.out.print(j+" ");
        }

System.out.println();
        if(l%2==0)
        {
            // int d=l/2;
            double d=(arr[(l/2)-1]+arr[l/2])/2;
            System.out.println(d);
        }
        
        else
        {
            // int d= l/2;
            System.out.print(arr[l/2]);
        }
        // System.out.print(arr[i]+" ");

    
    }
}