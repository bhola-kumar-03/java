public class Demo {
   public static void main(String a[]){
       int n = 8;
       int k = n-1;
       for(int i=n-1;i>=0;i--){
           for(int j=0;j<=k;j++){
               if(j==i||j==k){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
           k++;
           System.out.println();
       }
   }
}