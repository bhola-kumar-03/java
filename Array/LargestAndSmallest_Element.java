// Given an array and a number K where K is smaller than the size of the array. Find the K’th smallest element in the given array. Given that all array elements are distinct.

// Examples:  

// Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
// Output: 7

// Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
// Output: 10 

import java.util.Scanner;

public class LargestAndSmallest_Element {
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of k");
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
        int k=sc.nextInt();
        int s=sc.nextInt();
        int n=arr.length;
        System.out.println("largest no from kth element: "+arr[n-k]);
        System.out.println("smallest no from kth element: "+arr[s-1]);

        
        }
    }