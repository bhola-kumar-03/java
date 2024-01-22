package BinarySearch;

import java.util.Arrays;

public class Binary {
    static int Find(int a[],int start,int end,int x)
    {
        if (start<=end) {
            // int mid=(start+end)/2;
            /*it is best condition to find mid
            mid=start+(end-start)/2;
             */
            int mid=start+(end-start)/2;
            if(x==a[mid])
            {
                return mid;
            }
            else if(x>a[mid])
            {
                return Find(a, mid+1, end, x);
            }
            else if(x<a[mid])
            {
                return Find(a, start, mid-1, x);
            }
        }
        return -1;
    }
    static int BinaryS(int []a,int start,int end,int x)
    {
        int s=start;
        int e=end;
        while (s<=e) {
            int mid=(s+e)/2;
            if(x==a[mid])
            {
                return mid;
            }
            else if(x>a[mid])
            {
                s=mid+1;
            }
            else if(x<a[mid])
            {
                e=mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int a[]={29, 12, 56,10 , 39, 40, 51,24 , 70};
        Arrays.sort(a);
        int x=29;
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int result= Find(a, 0, a.length,x);

        // int result=BinaryS(a,0, a.length, x);
        if(result!=-1)
        {
            System.out.println(x+" is present in array position :"+(result+1));
        }
        else
        {
            System.out.println("not present in array");
        }
    }
}
