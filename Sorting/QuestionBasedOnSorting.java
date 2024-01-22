package Sorting;
public class QuestionBasedOnSorting {
    static void Question(int []a)
    {
        int x=-1,y=-1;
        int n=a.length;
        if (n<=1) {
            return;
        }
        for(int i=1;i<a.length;i++)
        {
            if(a[i-1]>a[i])
            {
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else
                {
                    y=i;
                }
            }
        }
        int temp=a[ x];
        a[x]=a[y];
        a[y]=temp;

    }
    public static void main(String ar[])
    {
        int a[]={3,8,6,7,5,9,10};
        Question(a);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
