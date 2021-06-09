import java.util.*;
class Employee
{
	protected int empid,salary;
	protected String name,address;
	Scanner sc=new Scanner(System.in);
	Employee()
	{
		empid=salary=0;
		name=address="";
	}
	Employee(int id,String n,int sal,String ad)
	{
		empid=id;
		name=n;
		salary=sal;
		address=ad;
	}
	void disp()
	{
		System.out.println("EMPLOYEE  ID  ="+empid);
		System.out.println("EMPLOYEE NAME ="+name);
		System.out.println("SALARY        ="+salary);
		System.out.println("ADDRESS       ="+address);
	}
}
class Teacher extends Employee
{
	String dpmt,sub;
	Teacher(int id,String n,int sal,String ad,String d,String s)
	{
		super(id,n,sal,ad);
		dpmt=d;
		sub=s;
	}
	void disp()
	{
		super.disp();
		System.out.println("DEPARTMENT    ="+dpmt);
		System.out.println("SUBJECT       ="+sub);
	}
}
class Employee_m
{
	public static void main(String[] args)
	{
		int n,empid,salary;
		String name,address,dpmt,sub;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Teachers:");
		n=Integer.parseInt(sc.nextLine());
		Teacher t[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("\n--Enter details of Teacher "+(i+1)+"--\n");
			System.out.print("Enter Employee ID:");
			empid=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Employee Name:");
			name=sc.nextLine();
			System.out.print("Enter Salary:");
			salary=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Address:");
			address=sc.nextLine();
			System.out.print("Enter Department:");
			dpmt=sc.nextLine();
			System.out.print("Enter Subject:");
			sub=sc.nextLine();
			t[i]=new Teacher(empid,name,salary,address,dpmt,sub);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\n----------\nEMPLOYEE "+(i+1)+"\n---------- ");
			t[i].disp();
		}
	}
}