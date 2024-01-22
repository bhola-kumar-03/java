// sorting of array in increasing form
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        increasing();
    }
    // here we declare method of TNRN method
    public static void increasing()
    {
        // here we take input from user
        Scanner sc=new Scanner(System.in);
        // int arr[]={12,1,25,32,14};
        // here we declare memory allocation of array
        int arr[]=new int[5];

        // here we take input through the indexing value using loop
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter element="+i);
            arr[i]=sc.nextInt();
        }

        // here we access each element of array using nested loop and apply positon defferene of indexing value and swap the value
        for(int i=0;i<arr.length;i++)
        {  
            for(int j=i+1;j<5;j++)
            {
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            }
        System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
