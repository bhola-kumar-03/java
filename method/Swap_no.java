public class Swap_no {
    public static void swap(int a,int b)
    {
        System.out.println("before swaping:"+ a);
        System.out.println("before swaping:"+b);
        int c=a;
        a=b;
        b=c;
        System.out.println();
        System.out.println();
        System.out.println("after swaping:"+ a);
        System.out.println("after swaping:"+b);
        // return (a,b);
    }
    public static void main(String[] args) {
        int x=3;
        int y=9;
        swap(x,y);
    }
}
