package Sorting;

public class NonZeroElement {
    public static void zero(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            int small=i;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==0)
                {
                    small=j;
                    break;
                }
            }
            if(a[small]<a[i])
            {
                int temp=a[small];
                a[small]=a[i];
                a[i]=temp;
            }
            
        }
        for(int k:a)
        {
            System.out.print(k+" ");
        }
    }

    public static void SecondMethod(int[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]==0 && a[j+1]!=0)
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []a={0,5,0,3,4,2};
        System.out.println("using selection sort:");
        zero(a);
        System.out.println("\nusing bubble sort:");
        SecondMethod(a);
    }
}
