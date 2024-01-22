package String;
import java.util.*;
public class ConsecutiveDuplicate {
    public static void main(String []ar)
    {
        String st = "aabbbbbccddee";
        char a = st.charAt(0);
        String ans = "";
        ans = ans + a;
        int count = 1;
        for(int i=1;i<st.length();i++)
        {
            char prev = st.charAt(i - 1);
            char curr = st.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                if(count>1) ans += count;
                count = 1;
                ans += curr;
            }
        }
        // ans += count;
        if (count > 1)
        {
            ans += count;
        }
        System.out.print(ans);
    }
}
