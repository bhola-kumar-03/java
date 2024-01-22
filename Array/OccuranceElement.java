import java.util.*;
public class OccuranceElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element of array:");
        int s=sc.nextInt();
        System.out.println("enter the value which youfind in array:");

        int n=sc.nextInt();
        int []a=new int [s];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            System.out.println("array:"+a[i]);
            if(a[i]==n)
            {
                count+=1;
            }
            else
            {
                continue;
            }
        }
        System.out.println("counting no:"+count);
    }
}
