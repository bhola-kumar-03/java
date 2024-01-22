public class star13 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(j>=i+1 && j<=8-i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=8;k++)
            {
                if(k>=6-i && k<=3+i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
