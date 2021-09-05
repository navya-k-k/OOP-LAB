import Arithmetic.*;
import java.io.*;
import java.util.*;
public class Program_14
{
    public static void main(String[] args)
    {
        int n1,n2,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number :");
        n1=Integer.parseInt(sc.nextLine());
        System.out.println("Enter Second Number :");
        n2=Integer.parseInt(sc.nextLine());
        do
        {
            System.out.println("\nMENU\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.EXIT");
            System.out.println("\nENTER YOUR CHOICE :");
            ch=Integer.parseInt(sc.nextLine());
            switch(ch)
            {
                case 1:Addition a=new Addition();
                       System.out.println("SUM = "+a.add(n1,n2));
                       break;
                case 2:Subtraction s=new Subtraction();
                        System.out.println("DIFFERENCE = "+s.sub(n1,n2));
                       break;
                case 3:Multiplication m=new Multiplication();
                        System.out.println("PRODUCT = "+m.mul(n1,n2));
                       break;
                case 4:Division d=new Division();
                        System.out.println("QUOTIENT = "+d.div(n1,n2));
                       break;
                case 5:break;        
            }
        }while(ch!=5);
    }
}