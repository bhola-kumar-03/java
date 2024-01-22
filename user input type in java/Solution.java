// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
        
//         Scanner scan = new Scanner(System.in);
//         int i = scan.nextInt();
//         double d = scan.nextDouble();
//         String s=scan.nextLine();
        

//         // Write your code here.

//         System.out.println("String: " + s);
//         System.out.println("Double: " + d);
//         System.out.println("Int: " + i);
//     }
// }
import java.util.*;
public class Solution{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}
