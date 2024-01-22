import java.util.*;
public class Power{
    static int Answer(int a,int b)
    {
        if(b==0)
        {
            return 1;
        }
        return a*Answer(a, b-1);
    }
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
        System.out.println("enter the base value and power value:");
        int a=ob.nextInt();
        int b=ob.nextInt();
        int p=Answer(a, b);
        System.out.println("power is:"+p);
        }
        
    }
}

// import java.util.*;

// public class Power {
//     static void Answer(int a, int b, int result) {
//         if (b >= 1) {
//             result *= a;
//             System.out.println(result);
//             Answer(a, b - 1, result);
//         }
//     }

//     public static void main(String[] args) {
//         try (Scanner ob = new Scanner(System.in)) {
//             System.out.println("enter the base value and power value:");
//             int a = ob.nextInt();
//             int b = ob.nextInt();
//             Answer(a, b, 1);
//         }
//     }
// }
