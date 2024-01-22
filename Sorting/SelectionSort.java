package Sorting;
import java.util.ArrayList;
public class SelectionSort {
    static void Selection(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int small=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[small])
                {
                    small=j;
                }
            }
            if(small !=i){ 
            int t=a[i];
            a[i]=a[small];
            a[small]=t;

            }
        }

        for(int k:a)
        {
            System.out.print(k+" ");
        }
    }



    static void UsingRecursion(int a[],int i){
        if(i==a.length){
            for(int j:a)
            {
                System.out.print(j+" ");
            }
            return;
        }
        int small=i;
        for(int j=i+1;j<a.length-1;j++)
        {
            if(a[j]<a[small])
            {
                small=j;
            }
        }
        if(small !=i)
        {
            int t=a[i];
            a[i]=a[small];
            a[small]=t;
        }
        UsingRecursion(a,i+1); 
    }



static ArrayList<Integer> UsingArray(int []a,int i)
{
    ArrayList<Integer> ans=new ArrayList<Integer>();
    if(i==a.length-1)
    {
        for(int j:a)
        {
            ans.add(j);
        }
        return ans;
    }
    
    int small=i;
    for(int j=i+1;j<a.length;j++)
    {
        if(a[j]<a[small])
        {
            small=j;
        }
    }

    if(small !=i)
    {
        int t=a[i];
        a[i]=a[small];
        a[small]=t;
    }
    ans.addAll(UsingArray(a,i+1));
    return ans;
    
}

    public static void main(String[] args) {
        int []a={30,90,47,69,52,88,71,18,20};
        System.out.println("before sorting:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n \nselection sort using nested loop:");
        Selection(a);
        System.out.println("\n \nselsection sort using recursion:");
        UsingRecursion(a,0);
        System.out.println("\n \nselection sort using arraylist:");
        ArrayList<Integer> ans=UsingArray(a,0);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
    }

}
