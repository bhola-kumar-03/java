import java.util.*;
public class Pentagonal_number {
    public static void pentagonal(int n)
    {  
        double p=1;
        for(double i=1;i<=n;i++)
        {
           p=(i * ((3*i - 1) / 2));
        //    here we are type casting double to int 
            int d=(int)p;
            System.out.println(d);
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        pentagonal(n);
        // System.out.println();
        
    }
}
