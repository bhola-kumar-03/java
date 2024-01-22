public class Loop {
    public static void main(String[] args) {
        for(int i=1;i<8;i++)
        {
            for(int j=i;j<8;j++)
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
                        if(i==1){
                            System.out.print("1");
                        }
                        else if(i==2)
                        {
                            System.out.print("2");
                        }
                        else if(i==3)
                        {
                        System.out.print("3");
                        }
                        else if(i==4)
                        {
                            System.out.print("4");
                        }
                    
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
