package multidimensionalArray;
import java.util.*;
public class Spiral_order {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.println("enter the value of row and column:");
        int r=ob.nextInt();
        int c=ob.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=ob.nextInt();
            }
            System.out.println();
        }

        Spiral(a, r, c);
        
    }

    public static void Spiral(int [][]a,int r,int c)
    {
        
        int left=0;
        int right=c-1;
        int top=0;
        int bottom=r-1;

        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.print(a[top][i]+" ");
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                System.out.print(a[i][right]+" ");
            }
            right--;

            // if(left<=right)
            // {
                for(int i=right;i>=left;i--)
                {
                    System.out.print(a[bottom][i]+" ");
                }
                bottom--;
            // }

            // if(top<=bottom)
            // {
                for(int i=bottom;i>=top;i--)
                {
                    System.out.print(a[i][left]+" ");
                }
                left++;
            // }
            
        }

    }
}
