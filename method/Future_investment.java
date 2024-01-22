import java.util.*;
public class Future_investment {
    public static void investment(int m,int r,int y)
    {
        for(int i=1;i<=y;i++)
        {
            double f=(m*r*i)/100;
            int e=(int)f;
            int b=m+e;
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount");
        int m=sc.nextInt();
        System.out.println("enter rate");
        int r=sc.nextInt();
        System.out.println("enter year");
        int y=sc.nextInt();
        investment(m,r,y);
    }
}
