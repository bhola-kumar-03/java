package multidimensionalArray;
// import  multidimensionalArray.Spiral_order.*;

import java.util.*;
public class Generate_nxn_matrix {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the value of matrix row and column n:");
        int n=ob.nextInt();
        Spiral_matrix(n);

        
    }
    static void Spiral_matrix(int n)
    {
        int [][]a=new int[n][n];
        int [][]b=Spiral(a,n);
        for(int []i:b)
        {
            for(int j:i)
            {
                System.out.print(j+"  ");
            }
        }
        
    }
    public static int[][] Spiral(int [][]a,int n)
    {
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int curr=1;

        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                a[top][i]=curr++;
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                a[i][right]=curr++;
            }
            right--;

            // if(left<=right)
            // {
                for(int i=right;i>=left;i--)
                {
                    a[bottom][i]=curr++;
                }
                bottom--;
            // }

            // if(top<=bottom)
            // {
                for(int i=bottom;i>=top;i--)
                {
                    a[i][left]=curr++;
                }
                left++;
            // }
            
        }

        return a;
    }
}
