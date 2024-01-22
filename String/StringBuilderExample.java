package String;
import java.util.*;
public class StringBuilderExample {
    public static void main(String[] args) {
        char []s={'a','b','c','d'};
        StringBuilder str=new StringBuilder("hello");

        str.append(" world");
        System.out.println(str);
        // setCharAt(index,ch)
        str.setCharAt(0, 'm');
        System.out.println(str);
        
        str.append(45 );
        str.append( false);
        System.out.println(str);
        // insert(index,ch): when we insert any char or any other thing then it add on given particular index and other element slidedown

        str.insert(0,'h');
        str.insert(2,s);
        System.out.println("\n"+str);
        str.deleteCharAt(1);
        System.out.println("\n"+str);
        str.delete(1,5);
        System.out.println(str);

        // reverse() and delete()
        
    }
}
