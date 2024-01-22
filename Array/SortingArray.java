public class SortingArray {
    public static void main(String[] args) {
        int []a={1,0,0,1,0,1,1,0,0};
        int n=a.length;
        int l=0,r=n-1;

        while(l<r)
        {
            if(a[l]==1 && a[r]==0)
            {
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
            }
            if(a[l]==0)
            {
                l++;
            }
            if(a[r]==1)
            {
                r--;
            }
            
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
