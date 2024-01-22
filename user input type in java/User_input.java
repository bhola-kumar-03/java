import java.util.*;
public class User_input {
    public static void main(String[] bhola) {
        Scanner sc= new Scanner(System.in) ;
        
        System.out.println("enter the integer value");
        int a=sc.nextInt();

        System.out.println("enter the float value");
        float f=sc.nextFloat();

        System.out.println("enter the double value");
        double d=sc.nextDouble();
        
        sc.nextLine();

        System.out.println("enter the string value");
        String s=sc.nextLine();
        
        
        
        System.out.println("enter the long value");
        long l=sc.nextLong();

        System.out.println("enter the short value");
        short sh=sc.nextShort();

        System.out.println("enter the boolean value");
        boolean b=sc.nextBoolean();

        System.out.println("enter the character value");
        char ch=sc.next().charAt(0);

        System.out.println("enter the byte value");
        byte by=sc.nextByte();

        System.out.println(ch);
        System.out.println(a);
        System.out.println(f);
        System.out.println(d);
        System.out.println(s);
        System.out.println(l);
        System.out.println(sh);
        System.out.println(by);
        System.out.println(b);

    }
}
