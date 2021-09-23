import java.io.*;

public class Program_22

{

    public static void main(String args[])

    {

        try

        {

            String str=" ";

            int n=0;

            FileReader fr=new FileReader("integers.txt");

            BufferedReader br=new BufferedReader(fr);



            FileWriter fw1=new FileWriter("even.txt");

            BufferedWriter bw1=new BufferedWriter(fw1);



            FileWriter fw2=new FileWriter("odd.txt");

            BufferedWriter bw2=new BufferedWriter(fw2);



            while((str=br.readLine())!=null)

            {

                n=Integer.parseInt(str);

                System.out.println(n);

                if(n%2==0)

                {

                    bw1.write(Integer.toString(n));

                    bw1.newLine();

                }

                else

                {

                    bw2.write(Integer.toString(n));

                    bw2.newLine();

                }

            }

            bw1.flush();

            bw2.flush();

        }

        catch(Exception e)

        {

            System.out.println(e);

        }

    }

}