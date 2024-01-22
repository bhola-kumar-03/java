class Two{
    public static void main(String[] args) {
        int a[][]={{10,20,30,40},{50,60},{10,40,54}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
