// public class LinearSearch {
//     static boolean Linear(int[] ar,int x,int i)
//     {
//         // boolean t=false;
//         if(i==ar.length)
//         {
//             return false;
//         }
//         if(x==ar[i])
//         {
//         return true;
//         }
//         return (Linear(ar, x, i+1));

//     }
//     public static void main(String[] args) {
//         int []ar={4,12,54,14,3,8,6,1};
//         if(Linear(ar,12,0)){
//             System.out.println("yes");
//         }
//         else
//         {
//             System.out.println("no");
//         }
//     }
// }


public class LinearSearch {
    static int Linear(int[] ar,int x,int i)
    {
        if(i==ar.length)
        {
            return -1;
        }
        if(x==ar[i])
        {
        return i;
        }
        
        return (Linear(ar, x, i+1));
        
    }
    public static void main(String[] args) {
        int []ar={4,12,54,14,3,8,6,1};
        System.out.println(Linear(ar,1,0));
    }
}
