public class reverse_digit {
    public static void main(String[] args) {
        int a=321;
        int r=0;
        while(a>0)
        {
            r=a%10;
            a=a/10;
            // System.out.println(r+" "+(a));
            System.out.print(r);
        }
        // System.out.println(r);
    }
}
