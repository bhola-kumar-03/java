package multidimensionalArray;
import java.util.*;
public class TransposesOf_Matrix {
    public static void main(String [] args)
    {
        Scanner ob =new Scanner (System.in);
        System.out.println("enter the row and column of matirx:");
        int r=ob.nextInt();
        int c=ob.nextInt();

        int [][]arr=new int[r][c];

        System.out.println("enter the value of matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=ob.nextInt();
            }
            System.out.println();
        }

        int [][]b=Transpose(arr,r,c);
        for(int []i:b)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // using another array. 


    // public static void Transpose(int[][]arr,int r,int c)
    // {
    //     int [][] a=new int[c][r];
    //     for(int i=0;i<c;i++)
    //     {
    //         for(int j=0;j<r;j++)
    //         {
    //                 a[i][j]=arr[j][i];

    //         }
    //     }

    //     for(int []i:a)
    //     {
    //         for(int j:i)
    //         {
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }


    // not using another array and it only valid for sqare matrix

    public static int[][] Transpose(int[][]arr,int r,int c){
        for(int i=0;i<r;i++)
        {
            for(int j=i;j<c;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }

}
