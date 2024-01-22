package String;
import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        String str="abcd";
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(0));
        
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<=str.length();j++)
            {
                System.out.print(str.substring(i,j)+" ");
            }
        }
        /*
         * output:
         * 
            a
            ab
            abc
            abcd

            b
            bc
            bcd

            c
            cd

            d
         */


    }
}
