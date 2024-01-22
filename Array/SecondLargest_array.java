public class SecondLargest_array {
    public static void main(String[] args) {
        int []a={9,36,5,87,9};
        int ic=0;

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<=a[j])
                {
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;

                }
                else
                {
                    
                    continue;
                }
                
            }
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=a[i+1])
            {
                ic=a[i+1];
                break;
            }
            else
            {
                continue;
            }
        }
        System.out.print(ic+" ");
    }
}

