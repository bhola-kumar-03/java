import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Integer in=Integer .valueOf(5);
        System.out.println(in);
        Float f=Float.valueOf(0.4f);
        System.out.println(f);
        String s=String.valueOf("bhola");
        System.out.println(s);
        Boolean b=Boolean.valueOf(8<6);
        System.out.println(b);

        ArrayList<Integer> li=new ArrayList<>();
        
        System.out.println(li);

        

        li.add(5);
        li.add(3);
        li.add(0);
        li.add(45);
        li.add(0,48);
        li.add(2,23);
        li.set(0,8);

        li.remove(Integer.valueOf(8));
        li.remove(1);

        System.out.println(li.remove(Integer.valueOf(3)));

        
        System.out.println(li);
        

        // System.out.println(li.get(1)+"\n");

        // for(int i=0;i<li.size();i++)
        // {
        //     System.out.println(li.get(i)+" ");
        // }

    }
}
