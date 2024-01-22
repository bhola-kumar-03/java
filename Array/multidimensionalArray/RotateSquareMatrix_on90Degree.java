package multidimensionalArray;
import java.util.*;
public class RotateSquareMatrix_on90Degree {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter row amd column of matrix:");
        int c=ob.nextInt();
        int r=ob.nextInt();

        int [][]a=new int [r][c];
        System.out.println("enter the value of matrix:");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
                a[i][j]=ob.nextInt();
            }
            System.out.println();
        }


        int[][]rotate=Rotate(a,r,c);

        for(int []i:rotate)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }

    public static int [][] Rotate(int [][]a,int r,int c)
    {
        int [][] arr=new int [r][c];
        if(r==c)
        {   int k=0;
            for(int i=r-1;i>=0;i--)
            { 
                for(int j=0;j<c;j++)
                {
                    arr[j][i]=a[k][j];
                }
                k++;
            }
        }
        else
        {
            System.out.println("please enter square matrix");
        }
        
        return arr;
    }
}
