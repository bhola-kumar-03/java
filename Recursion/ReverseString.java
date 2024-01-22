public class ReverseString {
    static String Reverse(String s,int i)
    {
        if(i==s.length())
        {
            return "";
        }
        String ans=Reverse(s,i+1);
        // String a="";
        // a+=s.charAt(i);
        
        return ans+s.charAt(i); 
    }
    public static void main(String abhay[])
    {

        String s="bhola";
        System.out.println(Reverse(s,0));
    }
}
