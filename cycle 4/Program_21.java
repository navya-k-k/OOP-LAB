   

import java.io.*;

import java.util.*;

public class Program_21

{

    public static void main(String args[])

    {

        try

        {

            FileReader fr1=new FileReader("first.txt");

            BufferedReader br1=new BufferedReader(fr1);

            FileWriter fw1=new FileWriter("second .txt");

            BufferedWriter bw1=new BufferedWriter(fw1);

            String s="";

            while((s=br1.readLine())!=null)

            {

                bw1.write(s);

                bw1.newLine();

                bw1.flush();

            }

            br1.close();

            bw1.close();

        }

        catch(Exception e)

        {

            System.out.println(e);

        }

    }
}