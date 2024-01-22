package String;
import java.util.*;
public class PalindromeSub {
    public static void main(String []args)
    {
        String s = "gjoergd";
        int i = 0;
        int j = s.length() - 1;
        boolean flag=true;
        while(i<=j)
        {
            if (s.charAt(i) == s.charAt(j)) {
                // System.out.println("palindrome ");
                flag = true;
            } else {
                flag = false;

            }
            i++;
            j--;
        }
        if(flag)
        {
            System.out.println("palindrome");
            
        }
        else {
            System.out.println(" not palindrome");
        }

    }
}
