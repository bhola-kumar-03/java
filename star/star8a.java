public class star8 {
    
    public static void main(String[] args) {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=7;j++)
        {
            
            if(j>=i)
            {
                System.out.print(j);
            }
        }
        for(int k=1;k<=i-1;k++)
        { 
            // if(k>=8-i)
            // {
                System.out.print(k);
            // }
            // else
            // {
            //     continue;
            // }
        }
        System.out.println();
        }
    }
}
