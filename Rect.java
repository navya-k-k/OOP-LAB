import java.util.*;
import java.io.*;
class Rect
{
	double width,length,area;
	String color;
	Rect()
	{
	}
	Rect(double w,double l,String c)
	{
                width=w;
                length=l;
                color=c;
	}
	void area()
	{
		System.out.println("LENGTH OF RECTANGLE  ="+length);
	       	System.out.println("WIDTH OF RECTANGLE   ="+width);
		System.out.println("COLOR OF RECTANGLE   ="+color);
		area=length*width;
		System.out.println("AREA OF RECTANGLE    = "+area);
	}
}
class Rectangle
{
	public static void main(String args[])
	{
		double length,width;
		String color;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nRECTANGLE 1\n");
		Rect r1=new Rect(5,4,"red");
		r1.area();
		System.out.println("\nRECTANGLE 2\n");
		System.out.print("Enter length of rectangle:");
		length=Double.parseDouble(sc.nextLine());
		System.out.print("Enter width of rectangle:");
                width=Double.parseDouble(sc.nextLine());
                System.out.print("Enter color of rectangle:");
                color=sc.nextLine();
		Rect r2=new Rect(length,width,color);
		r2.area();
		if(r1.area==r2.area && r1.color.equals(r2.color))
		{
			System.out.println("\n-----MATCHING RECTANGLE-----");
		}
		else
		{
			System.out.println("\n-----NO MATCHING RECTANGLE-----");
		}

	}
}