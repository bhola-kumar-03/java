import java.util.*;
public class PalindromeString {
    static String Reverse(String s,int i)
    {
        if(i==s.length())
        {
            return "";
        }
        String ans=Reverse(s,i+1);
        return ans+s.charAt(i); 
    }
    
    
    boolean Palindrome(String s,int l,int i)
    {
        if(l>=i)
        {
            return true;
        }
        return (s.charAt(l)==s.charAt(i))&& Palindrome(s, l--, i++);
    }




    public static void main(String abhay[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        
        String p=(Reverse(s,0));
        if(s.equals(p))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }


        // boolean method to find palindrome;
        PalindromeString ob=new PalindromeString();
        boolean ans=ob.Palindrome(s, s.length()-1, 0);
        if(ans)
        {
            System.out.println("palindrome :");
        }
        else
        {
            System.out.println("not");
        }
        
    }
}
