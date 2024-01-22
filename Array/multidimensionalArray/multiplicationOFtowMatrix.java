package multidimensionalArray;
import java.util.*;
public class multiplicationOFtowMatrix {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);


        System.out.println("enter the row and column of matrix a:");
        int r1=ob.nextInt();
        int c1=ob.nextInt();
        int [][]a=new int[r1][c1];
        System.out.println("enter the element of matrix a:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=ob.nextInt();
            }
            System.out.println();
        }



        System.out.println("enter the row and column of matrix b:");
        int r2=ob.nextInt();
        int c2=ob.nextInt();
        int [][]b=new int[r2][c2];
        System.out.println("enter the value of matrix b:");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=ob.nextInt();
            }
            System.out.println();
        }


        multiplicationOFtowMatrix sc=new multiplicationOFtowMatrix();
        sc.PrintArray(a, b, r1, r2, c1, c2);
        

    }


    void PrintArray(int [][]a,int[][]b,int r1,int r2,int c1,int c2)
    {

        int [][]res=new int[r1][c2];

        if(c1==r2)
        {
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<c1;k++)
                    {
                        res[i][j]+=(a[i][k]*b[k][j]);
                    }
                }
                
            }
            System.out.println();
        }
        else
        {
            System.out.println("multiplication is not possible");
        }

        for(int []i:res)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // return res;
    }
}
