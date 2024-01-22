package multidimensionalArray;
import java.util.*;
public class AddTwoMatrix {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the row and column of matrix a:");
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int [][]a=new int[r1][c1];

    System.out.println("enter the row and column of matrix b:");
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    int [][]b=new int[r2][c2];

    // System.out.println("enter the row and column of matrix a:");
    int [][]res=new int[r1][c1];

    System.out.println("enter the value of matrix a:");
    for(int i=0;i<r1;i++)
    {
        for(int j=0;j<c1;j++)
        {
            a[i][j]=sc.nextInt();
        }
        System.out.println();
    }

    System.out.println("enter the value of matrix b:");

    for(int i=0;i<r2;i++)
    {
        for(int j=0;j<c2;j++)
        {
            b[i][j]=sc.nextInt();
        }
        System.out.println();
    }

    if(r1==r2 && c1==c2)
    {
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                res[i][j]=a[i][j]+b[i][j];
            }
            System.out.println();
        }
    }
    else
    {
        System.out.println("additon is not perform becaue both matrix row and column are not same:");
    }

    AddTwoMatrix a1=new AddTwoMatrix();
    a1.PrintArray(res);
}
void PrintArray(int [][]res)
{
    for (int[] row : res) {
        for (int element : row) {
            System.out.print("|"+element + " | ");
        }
        System.out.println(); // Move to the next line after each row
    }
}
}
