import java.util.*;
public class ractangle {
public static void main(String[] args) 
{
    int length,width;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter length and widht of ractangle:");
    length=obj.nextInt();
    width=obj.nextInt();
    int area=length*width;
    int perimeter=2*(length+width);
    System.out.print(area +" "+ perimeter);


    
}
}
