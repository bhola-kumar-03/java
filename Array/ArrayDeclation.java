public class ArrayDeclation {
    public static void main(String[] args) {
        int[][] x={ {12,10},{21,41}};
    
        int  [][]a={{10,20},{30,20}};

        int[]  []b={{40,50},{60,10}};
        int[]  c[]={{70,80},{90,10}};

        int  []e[]={{54,21},{56,42}};
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<x.length;j++)
            {
                System.out.println(x[i][j]);

                System.out.println(a[i][j]);

                System.out.println(c[i][j]);
            }
        }

    }
}
