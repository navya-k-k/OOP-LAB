import java.util.*;
class Complex
{
	float real,img;
	Complex()
	{
	}
	Complex(float r,float i)
	{
		real=r;
		img=i;
	}
	Complex add(Complex c1,Complex c2)
	{
		Complex temp=new Complex();
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}

	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the real part :");
		real=Float.parseFloat(sc.nextLine());
		System.out.print("Enter the imaginery part:");
		img=Float.parseFloat(sc.nextLine());

	}
	public static void main(String args[])
	{
                System.out.println("\n---COMPLEX NUMBER ADDITION---");
		Complex c1=new Complex();
		c1.read();
		System.out.println("\nCOMPLEX NUMBER 1:");
		System.out.println(c1.real+"+"+c1.img+"i");
		Complex c2=new Complex();
		c2.read();
		System.out.println("\nCOMPLEX NUMBER 2:");
		System.out.println(c2.real+"+"+c2.img+"i");
		Complex c3=new Complex();
		System.out.println("\n----AFTER ADDITION:----");
		c3=c3.add(c1,c2);
		System.out.println("\n"+c3.real+"+"+c3.img+"i");

	}
}