public class SuffleArray {
    public static int[] Suffle(int[] arr,int n)
    {
        int l=arr.length;
        int[] a=new int [l];
        int pos=0;
        int k=n;
        for(int i=0;i<l;i++)
        {
            System.out.println("k="+k+" pos= "+pos+" i="+i);
            if(i%2==0)
            {
                a[i]=arr[pos];
                pos++ ;
                
            }
            else
            {
                a[i]=arr[k];
                k++;
                
            }
            
            
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,4,1,7};
        int []d=Suffle(arr,3);
        for(int i:d)
        {
            System.out.print(i+" ");
        }
        
    }
}
