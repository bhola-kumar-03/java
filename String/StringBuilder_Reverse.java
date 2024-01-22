package String;
import java.util.*;
public class StringBuilder_Reverse {
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
