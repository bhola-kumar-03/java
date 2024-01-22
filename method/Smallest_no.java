// waj method to find the smallest number among three numbers take nothing and return nothing
import java.util.*;
public class Smallest_no {
    public static void smallest()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=obj.nextInt();
        System.out.println("enter the value of b:");
        int b=obj.nextInt();
        System.out.println("enter the value of c:");
        int c=obj.nextInt();
        if(a==c && a==b && b==c)
        {
            System.out.println("all value are same");
        }
        
        else if(a<b)
        {
            if(a<c)
            {
                System.out.println("a is smallest: "+a);
            }
            else
            {
                System.out.println("c is smallest: "+c);
            }
        }
        else if(b<c)
        {
            System.out.println("b is smallest: "+b);
        }
        else
        {
            System.out.println("c is smallest: "+c);
        }
    }
    public static void main(String[] args) {
        // Smallest_no sc=new Smallest_no();
        smallest();
        
        }
    }
            // public static int smallest()
            // {
            //     Scanner obj=new Scanner(System.in);
            //     System.out.println("enter the value of a:");
            //     int a=obj.nextInt();
            //     System.out.println("enter the value of b:");
            //     int b=obj.nextInt();
            //     System.out.println("enter the value of c:");
            //     int c=obj.nextInt();
                
            //     if(a<b)
            //     {
            //         if(a<c)
            //         {
            //             System.out.println("a is smallest: ");
            //             return a;
            //         }
            //         else
            //         {
            //             System.out.println("c is smallest: ");
            //             return c;
            //         }
            //     }
            //     else if(b<c)
            //     {
            //             System.out.println("b is smallest: ");
            //             return b;
            //     }
            //     else
            //     {
            //             System.out.println("c is smallest: ");
            //             return c;
            //     }
                
            // }


//     public static void main(String[] args) {
//         // Smallest_no sc=new Smallest_no();
//         int d=smallest();
//         System.out.println(d);
//     }
// }
