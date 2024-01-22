public class star9 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=6;j++)
            {
                // if((i==1 || i==3)&&(j==1 || j==3 || j==5))
                // {
                //     System.out.print("1");
                // }
                // else if((i==2 || i==4)&&(j==2 || j==4 || j==6))
                // {
                //     System.out.print("1");
                // }
                // else
                // {
                //     System.out.print("2");
                // }
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}
