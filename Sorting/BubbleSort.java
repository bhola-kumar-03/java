/*
time complexity o(n^2)

Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.


traverse from left and compare adjacent elements and the higher one is placed at right side. 
In this way, the largest element is moved to the rightmost end at first. 
This process is then continued to find the second largest and place it and so on until the data is sorted.


 */


package Sorting;
import java.util.*;
public class BubbleSort {
    static void Bubble(int []a,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []a={5,8,6,1,5,2,3};
        Bubble(a, a.length);
        
    }
}
