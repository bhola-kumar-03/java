import java.util.*;

public class deleteElement {

    public static void main(String[] args) {
        int []arr={41,25,12,10,20,32};
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the value which you want to delete i array:");
        int k=ob.nextInt();
        int in=index(arr,k);
        if (in != -1) {
            for(int i=in;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length - 1] = 0;//here we just add last element 0 because when the all element shift in right side then one index element is empty but size of array i not reduce

            // int[] newArr = Arrays.copyOf(arr, arr.length - 1); //here we copy new array which we get after delete an element and reduce the size of old array and assign in new array
            
            for(int j:arr)
            {
                System.out.print(j+" ");
            }
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int index(int []arr,int k)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k)
            {
                return i;
            }
        }
        return -1; // Return -1 if element is not found
    }
}
