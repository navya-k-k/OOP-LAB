import java.util.*;
class Person
{
	protected String name,gen,add;
	protected int age;
	Person(String n,String g,String a,int ag)
	{
		name=n;
		gen=g;
		add=a;
		age=ag;
	}
	void disp()
	{
		System.out.println("\nNAME   =  "+name+"\nGENDER = "+gen+"\nADDRESS = "+add+"\nAGE  = "+age);
	}	
}
class Employee  extends Person
{
	protected int empid,sal;
	protected String cmpny_name,qual;
	Employee(String n,String g,String a,int age,int id,String cn,String q,int s)
	{
		super(n,g,a,age);
		empid=id;
		cmpny_name=cn;
		qual=q;
		sal=s;
	}
	void disp()
	{
		super.disp();
		 System.out.println("EMPLOYEE_ID = "+empid+"\nCOMPANY_NAME = "+cmpny_name+"\nQUALIFICATION = "+qual+"\nSALARY = "+sal);
	}

}
class Teacher extends Employee
{
	String sub,dpmt;
	int t_id;
	Teacher(String n,String g,String a,int age,int id,String cn,String q,int s,String sb,String dpt,int t)
	{
		super(n,g,a,age,id,cn,q,s);
		sub=sb;
		dpmt=dpt;
		t_id=t;
	}
	void disp()
	{
		super.disp();
	        System.out.println("SUBJECT = "+sub+"\nDEPARTMENT = "+dpmt+"\nTEACHER_ID = "+t_id);
	}
}
class Person_f
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter Number of teachers:");
		n=Integer.parseInt(sc.nextLine());
		Teacher t[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("\n--Enter Details of Teacher "+(i+1)+"--\n");
			System.out.print("Enter Name:");
			String name=sc.nextLine();
			System.out.print("Enter Gender:");
			String gen=sc.nextLine();
			System.out.print("Enter Address:");
			String add=sc.nextLine();
			System.out.print("Enter age:");
			int age=Integer.parseInt(sc.nextLine());
			System.out.print("Enter employee ID:");
			int empid=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Company Name:");
			String cmpny_name=sc.nextLine();
			System.out.print("Enter Qualification:");
			String qual=sc.nextLine();
			System.out.print("Enter Salary:");
			int sal=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Subject:");
			String sub=sc.nextLine();
			System.out.print("Enter Department:");
			String dpmt=sc.nextLine();
			System.out.print("Enter Teacher ID:");
			int t_id=Integer.parseInt(sc.nextLine());
			t[i]=new Teacher(name,gen,add,age,empid,cmpny_name,qual,sal,sub,dpmt,t_id);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\n---------\nEMPLOYEE "+(i+1)+"\n--------\n");
			t[i].disp();
		}
	}
}