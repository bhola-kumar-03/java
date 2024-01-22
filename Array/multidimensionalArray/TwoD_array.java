package multidimensionalArray;

// takin input
import java.util.*;
public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row:");
        int r=sc.nextInt();
        System.out.println("enter the number of column:");
        int c=sc.nextInt();

        // creating two dimensional array
        int [][]a=new int [r][c];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        for (int[] row : a) {
            for (int element : row) {
                System.out.print("|"+element + " | ");
            }
            System.out.println(); // Move to the next line after each row
        }
        
    }
}
