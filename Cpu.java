
class Cpu
{
  int price;
  public void disp(int p)
  {
    System.out.println("\n----CPU DETAILS----\n");
    System.out.println("PRICE  = "+p);

  }

  class Processor
  {
    int no_of_cores;
    String manufacturer;
    public void disp(int c,String m)
    {
      System.out.println("\n--PROCESSOR DETAILS--\n");
      System.out.println("NUMBER OF CORES  = "+c);
      System.out.println("MANUFACTURER     = "+m);
    }

  }
  static class RAM
  {
    static int memory;
    static String manufacturer;
    public void disp(int my,String m)
    {
      System.out.println("\n--RAM DETAILS--\n");
      System.out.println("MEMORY         = "+my);
      System.out.println("MANUFACTURER   = "+m);
    }
  }
}
class Cpu_main
{
  public static void main(String args[])
  {
    Cpu c=new Cpu();
    C.disp(14000);
    Cpu.Processor p=c.new Processor();
    p.disp(6,"AMD");
    Cpu.RAM r=new Cpu.RAM();
    r.disp(4,"Micron");
  }
}