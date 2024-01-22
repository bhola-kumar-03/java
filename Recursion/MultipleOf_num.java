public class MultipleOf_num {
    static void num(int n,int k)
    {
        int p=n;
        if(k==1)
        {
            System.out.println(n);
            return;
        }
        num(n, k-1);
        int ans=p*k;

        System.out.println(ans+" ");
    }

    public static void main(String s[])
    {
    num(3,8);
        // System.out.println(result+" ");
    }
}
