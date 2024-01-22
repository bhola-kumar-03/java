package String;
import java.util.*;
public class charAt {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter string: ");
            String str=sc.nextLine();
            System.out.println(str);
            System.out.println(str.charAt(4));
        }
        
    }
}
