package BinarySearch;
public class FindIndexOfMinNo_InRotatedArr {
    static int FindIndex(int []a)
    {
        int n=a.length;
        int st=0;
        int end=n-1;
        int ans=-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(a[mid]<=a[n-1])
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String []args)
    {
        int []a={5,6,7,8,1,2,3,4};
        System.out.println(FindIndex(a));
    }
}
