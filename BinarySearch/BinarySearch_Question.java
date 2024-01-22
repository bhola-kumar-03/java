//find x=5 in this given sorted array
// 5 5 5 5 6 6 7 8 9


package BinarySearch;
public class BinarySearch_Question {
    static int Binary(int []a,int x)
    {
        int start=0;
        int end=a.length;
        int fo=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(x==a[mid])
            {
                fo=mid;
                // it is start from start to end which is match first then return its index value

                end=mid-1;


                // it is find by end to start point when which is match end to first then print end ind

                // start=mid+1;

            }
            else if(x<a[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
    int[] a = {5, 5, 5, 5, 6, 6, 7, 8, 9};
    int x = 5;
    int ans=Binary(a,x);
    if(ans !=-1)
    {
        System.out.println(x+" is present in array at initial point= "+ans);
    }
    else
    {
        System.out.println("not present in array");
    }
}
}
