package Sorting;

public class MergeSort {
static void mergeSort(int a[],int l,int r)
{
    if (l>=r) 
    {return;}

    int midId=(l+r)/2;
    System.out.println(midId+" 1st call");
    mergeSort(a, l, midId);
    System.out.println(midId+" second call"+"l="+l);
    mergeSort(a, midId+1, r); 
    Merging(a,l,midId,r);
    
}


static void Merging(int[] a, int l, int midId, int r) {
    int i,j,k;
    int n1=midId-l+1;
    int n2=r-midId;
    int left[]=new int[n1];
    int right[]=new int[n2];
    
    
    for(i=0;i<n1;i++)
    {
        left[i]=a[l+i];
    }
    for(j=0;j<n2;j++)
    {
        right[j]=a[midId+1+j];
    }
    i=0;
    j=0;
    k=l;
    while (i<n1 && j<n2) {
        if (left[i]<=right[j]) {
            a[k]=left[i++];
        }
        else
        {
            a[k]=right[j++];
        }
        k++;
    }
    while (i<n1) {
        a[k++]=left[i++];
    }
    while (j<n2) {
        a[k++]=right[j++];
    }
}

static void printArray(int[]a,int n)
{
    for(int i:a)
    {
        System.out.print(i+" ");
    }
}

public static void main(String[] args) {
        int []a={4,5,2,8,6};
        // int []a={12,31,25,8,32,17,40,42};
        System.out.println("array before sorting:");
        // printArray(a, a.length);
        mergeSort(a, 0, a.length-1);
        System.out.println("\n after sorting:");
        printArray(a, a.length);
        System.out.println();
        // System.out.println(3/2);
    }
}  

