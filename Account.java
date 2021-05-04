import java.io.*;
class Account
{
	int acc_no,c_amt,bal,d_amt;
	String name,acc_type;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void read()
	{
		try
		{
			System.out.println("\nEnter Account Holders name:");
			name=br.readLine();
			System.out.println("\nEnter Account Type:");
			acc_type=br.readLine();
			System.out.println("\nEnter Account Number:");
			acc_no=Integer.parseInt(br.readLine());
		}
		catch(IOException e)
		{			
		}

	}
	void credit()
	{
		try
		{
			System.out.println("\nEnter Amount to deposit:");
			c_amt=Integer.parseInt(br.readLine());
			bal=1000;
			bal=bal+c_amt;
			System.out.println("\nNew Balance = "+bal);
		}
		catch(IOException e)
		{
		}
	}
	void debit()
	{
		try
		{		
			System.out.println("\nEnter Amount to Withdraw:");
			d_amt=Integer.parseInt(br.readLine());
			if(bal-d_amt<=1000)
			{
				System.out.println("\nInsufficient Balance");
				System.out.println("\nCURRENT BALANCE="+bal);
			}
			else
			{
				bal=bal-d_amt;
				System.out.println("\nAFTER DEBIT ---NEW BALANCE="+bal);
			}
		}
		catch(IOException e)
		{
		}
	}
	void disp()
	{
		System.out.println("\nDETAILS OF ACCOUNT HOLDER 1\n");
		System.out.println("-------------------------------");
		System.out.println("\n\nACCOUNT HOLDER NAME = "+name);
		System.out.println("\nACCOUNT TYPE        ="+acc_type);
		System.out.println("\nACCOUNT NUMBER      ="+acc_no);
		System.out.println("\nBALANCE             ="+bal);

	}
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("--NUMBER 1--\n");
		Account acc_1=new Account();
		acc_1.read();
		acc_1.credit();
		acc_1.debit();
		acc_1.disp();
		System.out.println("\n\n--NUMBER 2--\n");
		Account acc_2=new Account();
		acc_2.read();
		acc_2.credit();
		acc_2.debit();
		acc_2.disp();
	}
}
