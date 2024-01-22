//  Write a Java method to count all vowels in a string
import java.util.*;
public class Count_vowel{
    public static int vowel()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name:");
        String s=sc.next();
        int count=0;
        for(int i=0;i<=s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count=count+1;
            }
            else
            {
                continue;
            }
        }
        return count;
        // System.out.println(count);
        
    }
    public static void main(String[] args) {
        int a=vowel();
        System.out.println(a);
    }

}