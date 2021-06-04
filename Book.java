import java.util.*;
class Book
{
	String title,author,pub;
	int price,isbn;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter ISBN :");
		isbn=Integer.parseInt(sc.nextLine());
		System.out.print("Enter title:");
		title=sc.nextLine();
		System.out.print("Enter Author:");
		author=sc.nextLine();
		System.out.print("Enter price:");
		price=Integer.parseInt(sc.nextLine());
		System.out.print("Enter publisher:");
		pub=sc.nextLine();
	}
	void disp()
	{
		System.out.println("ISBN     ="+isbn);
		System.out.println("TITLE    ="+title);
		System.out.println("AUTHOR   ="+author);
		System.out.println("PRICE    ="+price);
		System.out.println("PUBLISHER="+pub);
	}
}
class Book_main
{
	public static void main(String args[])
	{
		Book b[]=new Book[5];
		System.out.println("Enter Book Details");
		for(int i=0;i<5;i++)
		{
			System.out.println("\nBOOK "+(i+1)); 
			b[i]=new Book();
			b[i].read();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(b[i].title.compareTo(b[j].title)>0)
				{
					Book temp;
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println("\n-DISPLAY DETAILS-\n");
		for(int i=0;i<5;i++)
		{
			System.out.println("\n--BOOK "+(i+1)+"--");
			b[i].disp();
		}
	}
}