package String;
import java.util.*;
public class ReverseEachWord {
    public static void main(String []ar)
    {
        StringBuilder sc = new StringBuilder("");
        String str = "i am an online educator";
        String ans = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sc.append(ch);
            } else {
                sc.reverse();
                ans += sc;
                ans += " ";
                sc = new StringBuilder("");
            }
        }
        sc.reverse();
        ans += sc;
        System.out.print(ans);
    }
}

