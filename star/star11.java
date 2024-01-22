public class star11 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=4;k++)
            {
                if(k<=i)
                {
                    System.out.print(k);
                }
            }
            for(int t=1;t<=i-1;t++)
            {
                System.out.print(t);
            }
            System.out.println();
        }
    }
}
