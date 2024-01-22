public class q2 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if(j<=4-i)
                {
                    System.out.print(" ");
                }
            }
            for(int k=1;k<=7;k++)
            {
                if(k<=i)
                {
                    System.out.print(i);
                }
                for(int t=1;t<4;t++)
            {   
                if(t>=5-i || t<=3+i)
                {
                    System.out.print(" ");
                }
            }
            }
            System.out.println();
        }
    }
}
