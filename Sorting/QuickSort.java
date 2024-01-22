package Sorting;
public class QuickSort {
    static void quickSort(int []a,int st,int end)
    {
        if(st>=end)
        {
            return;
        }
        int pi=Partation(a,st,end);
        quickSort(a,st,pi-1);
        quickSort(a,pi+1,end);
    }

    static void swap(int []a,int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

    static int Partation(int []a,int st,int end)
    {
        int pivot=a[st];
        int count=0;
        for(int i=st+1;i<=end;i++)
        {
            if(a[i]<=pivot)
            {
                count++;
            }
        }
        int pivotInd=st+count;
        swap(a,st,pivotInd);
        int i=st;
        int j=end;
        while(i<pivotInd && j>pivotInd)
        {
            while(a[i]<=pivot)
            {
                i++;
            }
            while(a[j]>=pivot)
            {
                j--;
            }
            if(i<pivotInd && j>pivotInd)
            {
                swap(a,i,j);
                i++;
                j--;
            }
        }
        return pivotInd;
    }

    static void printArray(int []a)
    {
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String ar[])
    {
        int a[]={24,9,29,14,19,27};
        System.err.println("before sorting:");
        printArray(a);
        quickSort(a,0,a.length-1);
        System.out.println("\nafter sorting:");
        printArray(a);
    }
}