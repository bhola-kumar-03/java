import java.util.*;
public class sum {
    public static void Sum(int a,int b) {
        System.out.println(a+b);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Sum(x,y);
        sc.close();
        
    }

}
