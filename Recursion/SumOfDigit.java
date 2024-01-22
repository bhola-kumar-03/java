public class SumOfDigit {
static int Sum(int n)
{
    if(n>=0 && n<10)
    {
        return n;
    }
    return Sum(n/10)+n%10;
}
public static void main(String a[])
{
    int n=1325;
    int s=Sum(n);
System.out.println(s);
}
}
