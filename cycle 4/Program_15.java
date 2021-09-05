import java.util.*;
class Program_15
{
    public static void main(String args[])
    {
        int n,size,sum=0;
        int count=0;
        float avg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N :");
        size=sc.nextInt();
        System.out.println("Enter "+size+" numbers:");
        for(int i=0;i<size;i++)
            {
                n=sc.nextInt();
                try
                {
                    if(n<0)
                    {
                        size++;
                        count++;
                        throw new NegativeException("Error raised : Negative number not allowed");
                        
                    }
                    else
                    {
                        sum=sum+n;
                    }
                }
                catch(NegativeException e)
                {
                    System.out.println(e);
                }
            }
            size=size-count;
            avg=sum/size;
            System.out.println("SUM = "+sum);
            System.out.println("AVERAGE = "+avg);
    }
}