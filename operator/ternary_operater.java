import java.util.*;
public class ternary_operater {
    public static void main(String[] args) {
        String result;
        Scanner bh=new Scanner(System.in);
        System.out.println("enter the value of :");
        int n=bh.nextInt();
        // for(int i=0;i<100;i++){
            result=(n%2==0)? "even ":"odd";
            System.out.println(result);
        // }
    }
}
