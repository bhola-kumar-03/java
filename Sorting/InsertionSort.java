package Sorting;

import java.util.ArrayList;

public class InsertionSort {
    public static void Insertion(int []a)
    {
        for(int i=1;i<a.length;i++)
        {
            int j=i;
            while(j>0 && a[j]<a[j-1])
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        
    }

    public static void UsingRecursion(int a[],int i)
    {
        if(i==a.length)
        {
            for(int j:a)
            {
                System.out.print(j+" ");
            }
            return;
        }
        int j=i;
        while(j>0 && a[j]<a[j-1])
        {
            int temp=a[j];
            a[j]=a[j-1];
            a[j-1]=temp;
            j--;
        }
        UsingRecursion(a,i+1);
    }

    public static int[] UsingRecursionReturn(int a[],int i)
    {
        if(i==a.length)
        {
            return a;
        }
        int j=i;
        while(j>0 && a[j]<a[j-1])
        {
            int temp=a[j];
            a[j]=a[j-1];
            a[j-1]=temp;
            j--;
        }
        int []b=UsingRecursionReturn(a,i+1);
        return b;
    }
/*using arraylist */
public static ArrayList<Integer> usingArraylist(int []a,int i)
{
    ArrayList<Integer> ans=new ArrayList<>();
    if(i==a.length)
        {
            for(int value:a)
            {
                ans.add(value);
            }
            return ans;
        }
        int j=i;
        while(j>0 && a[j]<a[j-1])
        {
            int temp=a[j];
            a[j]=a[j-1];
            a[j-1]=temp;
            j--;
        }
        ArrayList<Integer>b=usingArraylist(a,i+1);
        return b;
}
    public static void main(String []bhola)
    {
        int []a={8,3,6,2,4};
        System.out.println("before sorting:");
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n\ninsertion sort using nested loop:");
        Insertion(a);
        System.out.println("\n\ninsertion sort using recursion not return:");
        UsingRecursion(a,1);
        System.out.println("\n\ninsertion sort using return array :");
        int []ans=UsingRecursionReturn(a,1);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n\nInsertion sort using arraylist:");
        ArrayList<Integer> result=usingArraylist(a,0);
        for(int i:result)
        {
            System.out.print(i+" ");
        }

    }
}
