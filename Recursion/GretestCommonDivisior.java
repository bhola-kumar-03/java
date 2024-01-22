public class GretestCommonDivisior {
    static int gcd(int n,int k)
    {
        if(k==0)
        {
            return n;
        }
        return gcd(k, n%k);
    }
    int lcm(int n,int k)
    {
        int d= gcd(n, k);
        int l=(n*k)/d;
        return l;
    }
    public  static void main(String a[])
    {
        int d=gcd(11,23);
        System.out.println(d);
        GretestCommonDivisior s=new GretestCommonDivisior();
        System.out.println(s.lcm(11,23));
    }
}
