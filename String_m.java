import java.util.*;

class String_m
{
	public static void main(String args[])
	{
		int ch;
		String str="";
		Strings s=new Strings();
		Scanner sc=new Scanner(System.in);
		System.out.print("\n--STRING MANIPULATION--\n\n");
		System.out.print("Enter the string :");
		str=sc.nextLine();
		do
		{
			System.out.println("\nMENU\n1.COUNT\n2.REPLACE\n3.REVERSE\n4.EXIT\n");
			System.out.println("\nEnter your choice:");
			ch=Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1:s.count(str);
				       break;
				case 2:s.replace(str);
				       break;
				case 3:s.reverse(str);
				       break;
				case 4:break;
			}
		}while(ch!=4);
	}
}

class Strings
{
	Scanner sc=new Scanner(System.in);
	void count(String str)
	{
		int i,j,len;
		String temp;
		String arr[]=str.split(" "); //split sentence by space
		len=arr.length; //find number of words
		int count[]=new int[len];
		for(i=0;i<len;i++)
		{
			count[i]=1; //assign initial count of each word as 1
		}
		for(i=0;i<len;i++)
		{
			temp=arr[i]; 
			for(j=i+1;j<len;j++)
			{
				if(temp.equals(arr[j])) //if match found
				{
					count[i]+=1;
					for(int k=j;k<len-1;k++)
						arr[k]=arr[k+1];
					len=len-1;
				}
			}

			System.out.println(temp+"  =  "+count[i]+" times");

		}

	}

	void replace(String str)
	{
		int i,len;
		String old1,new1;
		String new_str=" ";
		System.out.println("Enter word to get replaced :");
		old1=sc.nextLine();
		System.out.println("Enter new word :");
		new1=sc.nextLine();
		String arr1[]=str.split(" ");
		len=arr1.length;
		for(i=0;i<len;i++)
		{
			if(old1.equals(arr1[i]))
				arr1[i]=new1;

		}
		System.out.println("\nNEW SENTENCE\n");
		for(i=0;i<len;i++)
			new_str=new_str+arr1[i]+" ";
		System.out.println("::"+new_str);
	}

	void reverse(String str)
	{
		String temp,sen,reverse="";
		int i,j,len;
		String arr[]=str.split(" ");
		len=arr.length;
		String rev[]=new String[len];
		for(i=0;i<len;i++)
			rev[i]="";
		for(i=0;i<len;i++)
		{
			temp=arr[i];
			sen="";
			for(j=(temp.length())-1;j>=0;j--)
				sen=sen+temp.charAt(j);
			rev[i]=sen;
		}
		for(i=0;i<len;i++)
			reverse=reverse+rev[i]+" ";
		System.out.println("Reversed Sentence = "+reverse);

	}

}

