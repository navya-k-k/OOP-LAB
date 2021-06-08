class Cpu
{
int price=3000;
public void disply_price()
{
System.out.println("CPU Price="+price);
}
class Processor
{
int no_cores=5;
String manufacturer="intel";
public void disply_detail()
{
System.out.println("processor no of cores="+no_cores);
System.out.println("processor manufacturer="+manufacturer);
}
}
static class Ram
{
static int memory=4;
static String manufacturer="chrysler";
public void disply_ram()
{
System.out.println("RAM memory in GB="+memory);
System.out.println("RAM manufacturer="+manufacturer);
}
}

}
public class Computer
{
public static void main(String args[])
{
Cpu c=new Cpu();
c.disply_price();
Cpu.Processor p= c.new Processor();
p.disply_detail();
Cpu.Ram r=new Cpu.Ram();
r.disply_ram();
}
}
