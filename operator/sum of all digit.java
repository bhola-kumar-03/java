public class sum of all digit {
    public static void main(String[] args) {
        int n=1234;
        int sum=0;
        int d;
        for(int i=1;i<n;i++)
        {
            d=n%10;
            n=n/10;
            sum=sum+d;
        }
        System.out.println("sum of all no in digit is :"+sum);
    }
}
