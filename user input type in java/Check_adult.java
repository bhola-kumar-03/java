import java.util.*;
public class Check_adult {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner obj=new Scanner(System.in);
        int age=obj.nextInt();

        if(age>=18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Not Adult");
        }
        }
    }
