// import java.util.*;
// public class Even_odd {
//     public static void main(String[] args) {
//         System.out.println("enter number");
//         Scanner obj=new Scanner(System.in);
//         int n=obj.nextInt();

//         if(n%2==0)
//         {
//             System.out.println("even");
//         }
//         else
//         {
//             System.out.println("odd");
//         }
//         }
//     }
// import java.util.*;
// class Even_odd{
//     public static void main(String[] args) {
//         System.out.println("enter the value of a and b and c");
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         if(a>b && a>c)
//         {
//             System.out.println("a is greater");
//         }
//         else if(b>c)
//         {
//             System.out.println("b is greater");
//         }
//         else
//         {
//             System.out.println("c is greater");
//         }

//     }
// }
import java.util.*;
class Even_odd{
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n) {
            case 1: System.out.println("hello");
                break;
            case 2:System.out.println("Namaste");
                break;
            case 3:System.out.println("Sastrikal paji");
                break;
            case 4:System.out.println("good morning");
                break;
            default:System.out.println("Not valid");
                break;
        }

    }
}