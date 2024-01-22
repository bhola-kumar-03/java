import java.util.*;
public class Three_D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element of 3d array");
        int a[][][]=new int[2][1][3];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i][j].length;k++)
                {
                    a[i][j][k]=sc.nextInt();
                    // System.out.print(a[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i][j].length;k++)
                {
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            // System.out.println();
        }
    }
}
