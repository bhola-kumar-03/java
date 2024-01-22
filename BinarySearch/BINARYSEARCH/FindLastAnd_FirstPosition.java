package BINARYSEARCH;
class FindLastAnd_FirstPosition {
    public static int[] searchRange(int[] nums, int target) {
        int a[]={-1,-1};
        int st=0;
        int end=nums.length-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(target==nums[mid])
            {
                a[0]=mid;
                end=mid-1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        st=0;
        end=nums.length-1;
        while (st<=end){
        int mid=st+(end-st)/2;
        if(target==nums[mid])
        {
            a[1]=mid;
            st=mid+1;
        }
        else if(target>nums[mid])
        {
            st=mid+1;
        }
        else
        {
            end=mid-1;
        }
        }
        return a;
        
    }
    public static void main (String[] args) {
        int nums[]={5,7,7,8,8,10};
        int []a=searchRange(nums,6);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}