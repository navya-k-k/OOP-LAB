import java.io.*;
class Symmetric
{
int n ;
int m;
int a[][] =new int[20][20];
int i;
int j;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
void read_matrix()throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("enter the no of row");
n=Integer.parseInt(br.readLine());
System.out.println("enter the no of column");
m=Integer.parseInt(br.readLine());
System.out.println("enter matrix values");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=Integer.parseInt(br.readLine());

}
}
}
public void symmetric_matrix()throws IOException
{
int tran[][]=new int[20][20];
int f=0;
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
tran[j][i]=a[i][j];
}
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(a[i][j]!=tran[i][j])
{
f=1;
}
}
}
if(f==0)
{
System.out.println("matrix are symmetric");
}
else
{
System.out.println("matrix are Asymmetric");
}
}
void disply_matrix() throws IOException
{
System.out.println("the marix is \n");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}

}
}
public class Matrix_sym
{
public static void main(String args[])throws IOException
{
Symmetric s=new Symmetric();
s.read_matrix();
s.disply_matrix();
s.symmetric_matrix();
}
}
