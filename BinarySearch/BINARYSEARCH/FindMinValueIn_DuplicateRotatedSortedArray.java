package BINARYSEARCH;
public class FindMinValueIn_DuplicateRotatedSortedArray {
    public static int findMin(int[] nums) {
        int st=0,end=nums.length-1;
        while(st<end)
        {
            int mid=st+(end-st)/2;
            if(nums[mid]==nums[end])
            {
                if(nums[mid]==nums[end])
                {
                    end--;
                }
                else if(nums[mid]==nums[st])
                {
                    st++;
                }
            }
    
            else if(nums[mid]<nums[end])
            {
                end=mid;
            }
            else 
            {
                st=mid+1;
            }
        } 
        return nums[st];
        }
    public static void main(String ar[])
        {
            int a[]={2,2,2,0,1};
            // int a[]={3,3,1,3};
            System.out.println(findMin(a));
        }
    }

