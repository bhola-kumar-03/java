public class SortingArray_Even {
        public static void main(String[] args) {
            int []a={1,2,4,5,2,6,8,4,5,7,6};
            int n=a.length;
            int l=0,r=n-1;
            while(l<r)
            {
                if(a[l]%2==0 && a[r]%2!=0)
                {
                    int temp=a[l];
                    a[l]=a[r];
                    a[r]=temp;
                }
                if(a[l]%2==0)
                {
                    r--;
                }
                if(a[r]%2!=1)
                {
                    l++;
                }
                
            }
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
    
