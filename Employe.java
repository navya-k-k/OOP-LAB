class Employe
{
	String name;
	int salary,empid;
	void read(int id,String n,int s)
	{
		empid=id;
		name=n;
		salary=s;
	}
	void dis()
	{
		System.out.println(empid+" "+name+" "+12*salary);
	}
	public static void main(String arg[])
	{
		Employee ob1=new Employee();
		ob1.read(1,"abin",500);
		ob1.dis();
		Employee ob2=new Employee();
		ob2.read(2,"sebin",1000);
		ob2.dis();
	}
}
