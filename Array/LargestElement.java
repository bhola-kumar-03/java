public class LargestElement {
    public static void main(String[] args) {
        int []a={3,2,1,5,2};
        int l=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>l){
                l=a[i]; 
            }
            
            System.out.println(l+" "+a[i]);
        }

        // System.out.print(l+" ");
    }
}
