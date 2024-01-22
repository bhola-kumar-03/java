public class Passing_array {
    public static void main(String[] args) {
        int num[]={0,1};
        change(num);
        printArray(num);
    }
    public static void change(int number[] )
    {
        number[0]=1;
        number[1]=0;
        // for(int i=0;i<number.length;i++)
        // {
        //     System.out.println((number[i]));
        // }
        // System.out.println();
        
    }
    public static void printArray(int number[])
    {
        for(int i=0;i < number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
    }
}
