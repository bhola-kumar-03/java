public class FindMaxInArray_usingRecursion {
    static int max(int []a,int n){
        int i=0;
        if(a[i]<a[n])
        {
            int temp=a[i];
            a[i]=a[n];
            a[n]=temp;
        }
        if(n==a.length-1)
        {
            return n;
        }
        max(a,n+1);
        return a[i];
    }

    public static void main(String a[])
    {
        int ar[]={4,7,6,52,45,78};
        System.out.println(max(ar,1));
    }
}


