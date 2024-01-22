public class SumOfArray {
    static int sum(int []a,int n)
    {
        if(n==a.length)
        {
            return 0;
        }
        int p = sum(a,n+1);
        return a[n]+p;
    }
    public static void main(String a[])
    {
        int ar[]={9,3,5,20};
        System.out.println(sum(ar,0));
    }
}
