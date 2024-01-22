public class ZeroMatrix {
    public static void main(String[] args) {

        int [][]a={{1,2,3},{0,4,6},{7,8,9}};
        // int []row;
        // int []col;
        int n=a.length;
        int m=a[0].length;   
        int answer[][] = new int[n][m];

            for (int i = 0; i < n; i++)   
            {  
                for (int j = 0; j < m; j++)   
                {  
                    answer[i][j] = 1;  
                }  
            }  


            for (int i = 0; i < n; i++)   
            {  
                for (int j = 0; j < m; j++)   
                {  
                    if (a[i][j] == 0)   
                    { 
                        for (int k = 0; k < m; k++)   
                        {  
                            answer[i][k] = 0;  
                        }  
                        break;  
                    }  
                }  
            }   
            for (int j = 0; j < m; j++)   
            {  
                for (int i = 0; i < n; i++)   
                {  
                    if (a[i][j] == 0)   
                    {  
                        for (int k = 0; k < n; k++)   
                        {  
                            answer[k][j] = 0;  
                        }  
                    }  
                }  
            }
            for (int i = 0; i < n; i++)   
            {  
                for (int j = 0; j < m; j++)   
                {  
                    if (answer[i][j] == 0)   
                    {  
                        a[i][j] = 0;  
                    }  
                }  
            } 
        
        for(int []i:answer)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}