// Write a Java method to compute the sum of digits in an integer.
import java.util.*;
public class Sum_digit {
    public static int sum(int n)
    {
        // int i=1;
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return sum;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter digit");
    int n=sc.nextInt();
    int a=sum(n);
    System.out.println(a);
}
}
