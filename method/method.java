import java.util.*;
public class method {
    public static void printMyname(String name) {
        
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter name");
        String name=ob.nextLine();
        printMyname(name);
        ob.close();
    }
}
