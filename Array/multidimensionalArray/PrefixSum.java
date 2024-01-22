public class PrefixSum {
    public static void main(String[] args) {
        int [][]a=new int[7][7];
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                a[i][j]=1;
            }
        }

        int sum=0;
        for(int i=3;i<6;i++)
        {
            for(int j=1;j<5;j++)
            {
                sum+=a[i][j];
            }
        }

        System.out.println("sum:"+sum);
    }
}
