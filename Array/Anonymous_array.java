public class Anonymous_array {
    public static void main(String[] args) {
        sum(new int[] {10,20,30});
    }
    public static void sum(int[]no)
    {
        int s=0;
        for(int i:no)
        {
            s+=s+i;
        }
        System.out.print(s);
    }
    
}
