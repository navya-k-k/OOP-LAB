import Graphics.*;
import java.io.*;
import java.util.*;
public class Program_13
{
    public static void main(String[] args)
    {
        int ch,l,b,h,sd,rd;
        Scanner sc=new Scanner(System.in);
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Square s=new Square();
        Circle c=new Circle();  
        do
        {
            System.out.println("\nMENU\n1.RECTANGLE\n2.TRIANGLE\n3.SQUARE\n4.CIRCLE\n5.EXIT");
            System.out.println("Enter your choice:");
            ch=Integer.parseInt(sc.nextLine());
            switch(ch)
            {
                case 1:System.out.println("Enter length :");
                      l=Integer.parseInt(sc.nextLine());
                      System.out.println("Enter Breadth :");
                      b=Integer.parseInt(sc.nextLine());
                      System.out.println("Area of Rectangle = "+r.area(l,b));
                      break;
                case 2:System.out.println("Enter Breadth:");
                      b=Integer.parseInt(sc.nextLine());
                      System.out.println("Enter Height :");
                      h=Integer.parseInt(sc.nextLine());
                      System.out.println("Area of Triangle = "+t.area(b,h));
                      break;
                case 3:System.out.println("Enter Side:");
                     sd=Integer.parseInt(sc.nextLine());
                     System.out.println("Area of Square = "+s.area(sd));
                     break;
                case 4:System.out.println("Enter Radius:");
                      rd=Integer.parseInt(sc.nextLine());
                      System.out.println("Area of Circle = "+c.area(rd));
                      break;
                case 5:break;
            }
        }while(ch!=5);
    }
}