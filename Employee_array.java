import java.util.*;
class Employee
{
	int no,sal;
	String name;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee ID :");
		no=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Employee Name:");
		name=sc.nextLine();
		System.out.print("Enter Salary:");
		sal=Integer.parseInt(sc.nextLine());
	}
	public void disp()
	{
		System.out.println("\nEMPLOYEE ID  = "+no);
		System.out.println("EMPLOYEE NAME ="+name);
		System.out.println("SALARY        ="+sal);
	}
}
class Employee_array
{
	public static void main(String args[])
	{
		int i,n,id;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of employees:");
		n=Integer.parseInt(sc.nextLine());
		Employee e[]=new Employee[n]; // array of objects
		System.out.println("\n---Enter Employee detail ---\n");
		for(i=0;i<n;i++)
		{
			e[i]=new Employee();
			e[i].read();
		}
		System.out.println("\nDISPLAY DETAILS");
		for(i=0;i<n;i++)
		{
			//e[i]=new Employee();
			e[i].disp();
		}

		System.out.println("\n\nSEARCH EMPLOYEE\n");
		System.out.print("Enter ID to search:");
		id=Integer.parseInt(sc.nextLine());
		for(i=0;i<n;i++)
		{
			if(e[i].no==id) //if id found
			{
				e[i].disp();
				break;
			} 
		}


	}
}