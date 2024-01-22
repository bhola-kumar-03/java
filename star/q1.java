import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the valu of a:");
        double a=sc.nextDouble();

        System.out.println("enter the valu of b:");
        double b=sc.nextDouble();

        System.out.println("enter the valu of c:");
        double c=sc.nextDouble();

    
        double d=(b*b)-(4*a*c);
        double s=Math.sqrt(d);

        root(d,s,b,a);

    }

    public static void root(double d,double s ,double b,double a)
    {
        
            double x;
            double y;
            x=(-b+s)/2*a;
            y=(-b-s)/2*a;
            System.out.print("first root="+x);
            System.out.print("second root="+y);
    

    }
        
        
        

    } 