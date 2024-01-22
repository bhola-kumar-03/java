public class Returing_Arrary {
    public static void main(String[] args) {
        int []numbers=getNumber();
        printArray(numbers);
    }
    public static int[] getNumber()
    {
        int []numbers={1,2,3,4,5};
        return numbers;
    }
    public static void printArray(int [] numbers)
    {
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
    }
}
