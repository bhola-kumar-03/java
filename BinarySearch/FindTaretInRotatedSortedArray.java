package BinarySearch;
public class FindTaretInRotatedSortedArray {
    static int FindTarget(int []a,int target)
    {
        int st=0;
        int end=a.length-1; 
        while(st<=end)
        {
            int mid=st+(end-1)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(a[mid]<a[end])
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
        return -1;
    }
    public static void main(String[] args) {
        // int []a={3,4,5,1,2};
        int []a={6,7,8,10,11,1,2,3,5};
        System.out.println(FindTarget(a,2));
    }
}
