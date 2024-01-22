public class star {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++)
        {
            for(int j=6;j>=1;j--)
            {System.out.print(j);
                if(j<=i)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
