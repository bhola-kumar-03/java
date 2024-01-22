/*
implement the find all index value in array using recursion nothing return use void method .
 */
// public class IndicesOfArray {
//     static boolean f = false;
//     static void Indice(int[] a, int x, int i) {
//         if (i == a.length) {
//             if (!f) {
//                 System.out.println("not present in array");
//             }
//             return;
//         }
//         if (x == a[i]) {
//             System.out.print(i + " ");
//             f = true;
//         }
//         Indice(a, x, i + 1);
//     }

//     public static void main(String[] args) {
//         int[] ar = {1, 2, 3, 2, 2, 5};
//         Indice(ar, 2, 0);
//     }
// }

/*
find the all indix no where the element is present in array throught ArrayList
 */
import java.util.ArrayList;
class IndicesOfArray{
    static boolean f=false;
    static ArrayList<Integer> List(int a[],int x,int i)
    {   ArrayList<Integer> ans=new ArrayList<>();
        if(i==a.length)
        {
            if(!f)
            {
                System.out.println("not present in array:"+x);
            }
            return new ArrayList<Integer>();
        }
        if(a[i]==x)
        {
            
            ans.add(i);
            f=true;
        }
        ArrayList<Integer>samll=List(a,x,i+1);
        ans.addAll(samll);
        return ans;
    }
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 2, 2, 5};
        ArrayList<Integer> ans=List(ar,2,0);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
    }
}
