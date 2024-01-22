// Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 
public class Peak_element {
    public static void main(String[] args) {
        // int arr[]={5,10,20,15};
        int arr[]={10,20,15,2,23,90,67};
        int max=0;
        for(int i=1;i<arr.length;i++)
        {
            
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i])
            {
            max=arr[i];
            // System.out.print(max+" ");
            }
            else
            {
                continue;
            }
            
            System.out.print(max+" ");
        }
        
    }
}
