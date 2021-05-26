import java.io.*;
class Matrix
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
public static Matrix sum(Matrix m1,Matrix m2)
{
int i,j;
Matrix temp=new Matrix();
temp.n=m1.n;
temp.m=m1.m;
if(m1.n==m2.n&& m1.m==m2.m)
{
for(i=0;i<m1.n;i++)
{
for(j=0;j<m2.m;j++)
{
temp.a[i][j]=m1.a[i][j]+m2.a[i][j];
}
}
}
else
{
System.out.println("no addition possible");
}
return temp;
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


public static void main(String args[]) throws IOException
{
Matrix m1=new Matrix();
Matrix m2=new Matrix();
Matrix temp=sum(m1,m2);
m1.read_matrix();
m2.read_matrix();
System.out.println("first matrix");
m1.disply_matrix();
System.out.println("second matrix");
21.disply_matrix();
temp=sum(m1,m2);
System.out.println("sum of first and second matrix");
temp.disply_matrix();
}
}
