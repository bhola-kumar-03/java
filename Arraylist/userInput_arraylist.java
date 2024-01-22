import java.util.ArrayList;
import java.util.Scanner;
public class userInput_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> in=new ArrayList<Integer>();
        
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        for(int i=0;i<l;i++)
        {
            System.out.println("enter the value of n:");
            int n=sc.nextInt();
            in.add(n); 
        }
        System.out.println(in);
        
    }
}
