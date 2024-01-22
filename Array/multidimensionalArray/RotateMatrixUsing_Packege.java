package multidimensionalArray;
import multidimensionalArray.TransposesOf_Matrix;
import java.util.*;
public class RotateMatrixUsing_Packege{
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int r = ob.nextInt();
        int c = ob.nextInt();

        int[][] ar = new int[r][r];
        System.out.println("Enter the values of the matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                ar[i][j] = ob.nextInt();
            }
            System.out.println();
        }

        for(int []i:ar)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\n");
        TransposesOf_Matrix sc = new TransposesOf_Matrix();

        int[][] b = TransposesOf_Matrix.Transpose(ar,r,r);

        reverse(b, r);
    }

    public static void reverse(int [][]b,int r)
    {
        int n=0;
        for(int i=0;i<r;i++)
        {
            int s=0;
            int e=r-1;


            while(s<e)
            {
                int temp=b[i][s];
                b[i][s]=b[i][e];
                b[i][e]=temp;
                s++;
                e--;
            }
        }

        for(int []i:b)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


}
