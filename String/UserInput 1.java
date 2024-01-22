// package String;
// import java.util.*;
// /**
//  * StringBuilder_UserInput
//  */
// public class  {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder str = new StringBuilder(sc.nextLine());
//         System.out.println("enter string");
//         System.out.println(str);

//     }
// }
package String;
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        char []s={'a','b','c','d'};
        StringBuilder str=new StringBuilder();
        str.append(s);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        char []ch=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ch[i]=str.charAt(i);
        }
        for(char i:ch)
        {
            System.out.print(i+" ");
        }
        
    }
}