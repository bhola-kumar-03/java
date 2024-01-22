import java.util.Scanner;
public class Relational_operator {
    public static void main(String[] args) {
        Scanner bh=new Scanner(System.in);
        System.out.println("enter the value of a and b:");
        int a=bh.nextInt();
        int b=bh.nextInt();

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        
    }
}
