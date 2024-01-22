import java.math.BigInteger;

class count_digit{
    public static void main(String bh[])
    {
        long n=12345;
        int count=0;
        // while(n>0)
        // {
        //     n=n/10;
        //     count+=1;
        // }
        // System.out.println(count);

        for(int i=0;i<n;i++)
        {
            
            n=n/10;
            count++;
            if(n>=1 && n<=9)
            break;
            
        }
        System.out.println("count is "+(count+1));
    }
}