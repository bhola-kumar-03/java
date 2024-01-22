public class RemoveOccuranceOf_TheString {
    static String Occurance(String s,int ind,char ch)
    {
        String o="";
        if(ind==s.length())
        {
            return "";
        }
        
        
        String p=Occurance(s,ind+1,ch);

        if(s.charAt(ind)!=ch)
        {
            o+=s.charAt(ind);
            
        }
        return o+p;
        
    }
    public static void main(String[] args) {
        String s="abhay";
        char ch='a';
        System.out.println(Occurance(s,0,ch));
    }
}
