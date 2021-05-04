import java.util.*;
public class Employee
{
	String e_id;
	int sal;
	String e_name;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Employee id:");
		e_id=sc.nextLine();
                System.out.print("Enter Employee Name:");
                e_name=sc.nextLine();
		System.out.print("Enter Monthly Salary:");
                sal=sc.nextInt();
	}
	void disp()
	{
		System.out.println("\nEMPLOYEE DETAILS\n");
		System.out.println("--------------------");
		System.out.println("EMPLOYEE ID    ="+e_id);
		System.out.println("EMPLOYEE NAME  ="+e_name);
		System.out.println("YEARLY SALARY  ="+sal*12);
	}

	public static void main(String args[])
	{
		System.out.println("-----EMPLOYEE 1-----");
		Employee e1=new Employee();
		e1.read();
		e1.disp();
		System.out.println("\n-----EMPLOYEE 2-----");
                Employee e2=new Employee();
                e2.read();
                e2.disp();
	}
}
