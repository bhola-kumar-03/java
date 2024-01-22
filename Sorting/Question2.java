package Sorting;
public class Question2 {

    static void Partation(int []a,int l,int r)
    {
        while(l>r)
        {
            while(a[l]<0)
            {
                l++;
            }
            while(a[r]>=0)
            {
                r--;
            }
            if(l>r)
            {
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={19,-20,7,-4,-13,11,-5,3};
        Partation(a, 0, a.length);
        for(int i:a)
        {System.out.print(i+" ");}
    }
}
