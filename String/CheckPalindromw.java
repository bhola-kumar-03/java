package String;
import java.util.*;
public class CheckPalindromw {
    public static void main(String []args)
    {
        String s = "abcba";
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            for (int j = i+1; j <= s.length(); j++) {
                if (palindrome(s.substring(i, j)) == true) {
                    System.out.print(s.substring(i, j) + " ");
                    count++;
                }
            }
        }
        
        System.out.println("\n"+count);
    }

    public static  boolean palindrome(String s)
    {
        int i = 0;
        int j = s.length() - 1;
        // boolean flag = true;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } 
            i++;
            j--;
        }return true;
        
    }
}
