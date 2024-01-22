import java.util.*;
public class Factorial {
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new  Scanner (System.in)) {
            System.out.println("enter the value of n:");
            int n=sc.nextInt();
            int f=fact(n);
            System.out.println("factorial: "+f);
        }
    }

}
