import java.util.*;
class SumOf_NaturalNo{
    static int sum(int n){
        if(n==1)
        {
            return 1;

        }
        else
        {
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=ob.nextInt();
        int s=sum(n);
        System.out.println("sum:"+s);

    }
}