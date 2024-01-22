public class sum_of_all_digit {
    public static void main(String[] args) {
        int n=1234;
        int a=n;
        int sum=0;
        int d;
        while(n>0){

            d=n%10;
            n=n/10;
            sum=sum+d;

            System.out.println(d+
            " "+(n));
        }
        System.out.println("sum of all no in digit is :"+sum);
    }
}
