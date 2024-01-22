// Write a Java method to count all the words in a string

import java.util.*;
public class Count_string {
    public static int count_string(String s)
    {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                count=count+1;
            }
            else
            {
                continue;
            }
        }return (count+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the stirng");
        // String s="The quick brown fox jumps over the lazy dog";
        String s=sc.nextLine();
        int a=count_string(s);
        System.out.println(a);
    }
}
