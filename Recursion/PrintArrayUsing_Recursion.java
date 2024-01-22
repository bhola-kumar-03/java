public class PrintArrayUsing_Recursion {
    static void arr(int []a,int n)
    {
        if(n==a.length){
            return;
        }
        System.out.print(a[n]+" ");
        arr(a,n+1);
        // System.out.print(a[n]+" "); this is also return inverse of array
        return;
        
    }
    static void Inverse(int []a,int n)
    {
        
        if(n<0){
            return;
        }
        System.out.print(a[n]+" ");
        Inverse(a,n-1);
        return;
    }
    
    public static void main(String[] args) {

        int []a={78,5,4,6,8};
        arr(a,0);
        System.out.println();
        Inverse(a,a.length-1);
    }
}
