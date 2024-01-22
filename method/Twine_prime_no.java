// import java.util.*;
public class Twine_prime_no {
    public static void main(String[] args) {
        int n=100;
        for(int i=2;i<n;i++)
        {
            if(i%(i+1)==0)
            {
                System.out.println("not prime no"
                );
            }
            else
            {
                System.out.println("prime no"+i);
            }
        }
    }
}
