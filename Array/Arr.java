import java.util.*;
public class Arr {
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of k");
        // int k=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<6;j++)
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
        System.out.println();
        // System.out.println(arr[k-1]);
        
        }
    }