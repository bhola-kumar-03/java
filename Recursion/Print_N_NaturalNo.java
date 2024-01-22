import java.util.*;
public class Print_N_NaturalNo {
    static void NatualNo(int n)
    {
        if(n>0)
        {
            NatualNo(n-1);
            System.out.println(n);
            // System.out.println();
            
            // NatualNo(n-1);
            
        }
    }
    public static void main(String b[])
    {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("entet the value of n:");
            int n=sc.nextInt();
            NatualNo(n);
        }
    }
}
