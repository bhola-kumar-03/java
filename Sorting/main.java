import java.util.*;
class main{
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
        System.out.println(j);
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
        // Selection(a);
        System.out.println();
        // UsingRecursion(a,0);

        ArrayList<Integer> ans=UsingArray(a,0);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
}
}
