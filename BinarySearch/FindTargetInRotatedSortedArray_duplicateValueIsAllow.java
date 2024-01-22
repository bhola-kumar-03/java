package BinarySearch;

public class FindTargetInRotatedSortedArray_duplicateValueIsAllow {
    static boolean FindTarget(int []a,int target)
    {
        int st=0;
        int end=a.length-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(a[mid]==target)
            {
                return true;
            }
            if(a[st]==a[mid] && a[mid]==a[end])
            {
                ++st;
                --end;
            }
            else if(a[mid]<=a[end])
            {
                if(target>a[mid] && target<=a[end])
                {
                    st=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            else
            {
                if(target>=a[st] && target<a[mid])
                {
                    end=mid-1;
                }
                else
                {
                    st=mid+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={0,0,0,1,1,1,2,0,0,0};
        boolean ans=FindTarget(a, 2);
        if(ans)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
