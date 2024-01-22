import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner bh=new Scanner(System.in);
        System.out.println("enter the no of which you want to take");
        int n=bh.nextInt();
        float sum=0;
        float e;
        for(int i=1;i<=n;i++)
        {
            e=bh.nextFloat();
            sum=sum+e;
        }
        float avg=sum/n;
        System.out.println(avg);
    }
}
