package Sorting;
class CounSort
{
    public static void main(String[] args) {
        int []a={3,1,9,7,1,2,4};
        count(a);
    }
    public static void count(int []a)
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
        // here we define countarray to count the no of initial array element
        int []countarray=new int[max+1];
        for(int i:a)
        {
            countarray[i]++;
        }
        // here if you want to print counarray 
        // rearrange(countarray, a);
        int n=a.length-1;
        for(int i=countarray.length-1;i>=0;i--)
        {
            int elm=countarray[i];
            if(elm != 0)
            {
                while (elm>0) {
                    a[n]=i;
                    elm--;
                    n--;
                }
            }
        }
        System.out.println();
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}