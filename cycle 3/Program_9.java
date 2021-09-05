import java.util.*;
class Shape
{
	void area(float l,float b)
	{
		System.out.println("AREA OF RECTANGLE = "+(l*b));
	}
	void area(float r)
	{
		System.out.println("AREA OF CIRCLE = "+(3.14*r*r));
	}
	void area(int s)
	{
		System.out.println("AREA OF SQUARE = "+(s*s));
	}
}
class Program_9
{
	public static void main(String args[])
	{
		Shape sh=new Shape();
		Scanner sc=new Scanner(System.in);
		int ch,s;
		float l,b,r;
		do
		{
			System.out.println("\nMENU\n1.RECTANGLE\n2.CIRCLE\n3.SQUARE\n4.EXIT");
			System.out.println("\nEnter your choice:");
			ch=Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1:System.out.println("Enter length:");
				       l=Float.parseFloat(sc.nextLine());
				       System.out.println("Enter breadth:");
				       b=Float.parseFloat(sc.nextLine());
				       sh.area(l,b);
				       break;
				case 2:System.out.println("Enter radius:");
					   r=Float.parseFloat(sc.nextLine());
					   sh.area(r);
					   break;
			    case 3:System.out.println("Enter side:");
					   s=Integer.parseInt(sc.nextLine());
					   sh.area(s);
					   break;
				case 4:break;

			}
		}while(ch!=4);
}
}
	