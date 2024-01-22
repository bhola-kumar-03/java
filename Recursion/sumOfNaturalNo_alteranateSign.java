public class sumOfNaturalNo_alteranateSign {
    static int Sum(int n)
    {
        
        if(n==1)
        {
            return n;
        }
        if(n%2==0)
        {
            return Sum(n-1)-n;
        }
        else
        {
            return Sum(n-1)+n;
        }

    }
    public static void main(String[] args) {
        int d=Sum(5);
        System.out.println(d);
    }
}
