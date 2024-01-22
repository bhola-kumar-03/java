public class Solving {
    public static void main(String[] args) {
        // here its output is synatax error (not convert int to boolean)
        // in c/c++ output is 1
        int a,b=1;
        if(++a)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(++b);
        }
    }
}
