package Sorting;

public class LexicographicalOrder {
    public static String[] Selsection(String []s)
    {
        for(int i=0;i<s.length;i++)
        {
            int minId=i;
            for(int j=i+1;j<s.length;j++)
            {
                if(s[j].compareTo(s[minId])<0)
                {
                    minId=j;
                }
            }
            String temp=s[i];
            s[i]=s[minId];
            s[minId]=temp;
        }
        return s;
    }
    public static void main(String[] args) {
        String []s={"papaya","lime","watermelon","apple","mango","kiwi"};
        System.out.println("using selection sort:");
        String []ans=Selsection(s);
        for(String i:ans)
        {
            System.out.print(i+" , ");
        }
    }
}
