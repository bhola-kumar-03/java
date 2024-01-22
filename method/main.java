import java.util.*;
public class main {
    public static void printMyname(String name) {
        
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String name=ob.nextLine();
        printMyname(name);
    }
}
