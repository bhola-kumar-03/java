package BINARYSEARCH;
public class matrix2d_Binarysearch {
    public static int[][] SearchPractice(int[][]a,int target )
    {
        int row=a.length;
        int col=a[0].length;
        int st=0;
        int end=row*col-1;
        int ans[][]={-1,-1};
        while (st<=end) {
            int mid=st+(end-st)/2;
            int midelm=[mid/col][mid%col];
            if(midelm==target)
            {
                return ans[mid/col][mid%col];
            }
            else if(midelm>target)
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return ans;
    }
    public static boolean SearchMatrix(int [][]a,int target)
    {
        int n=a.length;
        int m=a[0].length;
        int st=0;
        int end=n*m-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            int midElt=a[mid/m][mid%m];
            if(midElt==target)
            {
                return true;
            }
            if(target<midElt)
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]a={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int ans[][]=SearchPractice(a, 3);
        for(int i:a[0])
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
        }
        // boolean result=SearchMatrix(a,3);
        // System.out.println(result);
    }
    public static boolean Search(int [][]a,int target)
    {
        int n=a.length;
        int m=a[0].length;
        int st=0;
        int end=n-1;
        int i=0;
        int j=0;

        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if (target==a[mid][st]) {
                return true;
            }
            else if(target<a[mid][st])
            {
                end=mid;
                i--;
            }

        }
        return false;
    }
}
