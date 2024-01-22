import java.util.*;
public class Middle_character {
    public static void middle(String s)
    {
        int n=s.length();
        if(n%2==0)
        {
            char m=s.charAt(n/2-1);
            char t=s.charAt(n/2);
            System.out.println(m+" "+t);
        }
        else
        {
            char f=s.charAt(n/2);
            System.out.println(f);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        middle(s);
    }
}
