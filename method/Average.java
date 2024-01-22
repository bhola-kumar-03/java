import java.util.Scanner;

public class Average {
    public static double average(int a,int b,int c)
    {
        double d=(a+b+c)/3;
        return d;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a=obj.nextInt();
            System.out.println("enter the value of b:");
            int b=obj.nextInt();
            System.out.println("enter the value of c:");
            int c=obj.nextInt();
            double e=average(a,b,c);
            
            System.out.println(e);
    }
}
