import java.util.*;
public class TSRN {
    public static void smallest(int a,int b,int c){
            if(a<b)
            {
                    if(a<c)
                    {
                        System.out.println("a is smallest: ");
                    }
                    else
                    {
                        System.out.println("c is smallest: ");
                    }
            }
            else if(b<c)
            {
                        System.out.println("b is smallest: ");
            }
            else
            {
                        System.out.println("c is smallest: ");
            }
                
    }
    
    public static void main(String[] args) 
    {
        // Smallest_no sc=new Smallest_no();
        Scanner obj=new Scanner(System.in);
            System.out.println("enter the value of a:");
            int a=obj.nextInt();
            System.out.println("enter the value of b:");
            int b=obj.nextInt();
            System.out.println("enter the value of c:");
            int c=obj.nextInt();
            smallest(a,b,c);
            // System.out.println(smallest(a,b,c));
    }
}
