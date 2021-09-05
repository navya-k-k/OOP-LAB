import java.util.*;
public class Program_18
{
    public static void main(String[] args)
    {
        int ch;
        String str;
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al1=new ArrayList<String>();
        do
        {
            System.out.println("\n---MENU--\n\n1.INSERT\n2.REPLACE\n3.REMOVE\n4.LENGTH\n5.GET VALUE\n6.DISPLAY\n7.SORT\n8.EXIT\n");
            System.out.println("Enter your choice:");
            ch=Integer.parseInt(sc.nextLine());
            switch(ch)
            {
                case 1:System.out.println("Enter the String:");
                        str=sc.nextLine();
                        al1.add(str);
                        System.out.println("\n--> UPDATED ARRAY LIST = "+al1);
                        break;
                case 2:System.out.println("Enter position :");
                        int pos=Integer.parseInt(sc.nextLine());
                        System.out.println("Enter new value:");
                       String str1=sc.nextLine();
                        al1.set(pos-1,str1);
                        System.out.println("\n--> UPDATED ARRAY LIST = "+al1);
                        break;
                case 3:System.out.println("Enter position :");
                        int pos1=Integer.parseInt(sc.nextLine());
                        al1.remove(pos1-1);
                        System.out.println("\n--> UPDATED ARRAY LIST = "+al1);
                        break;
                case 4:System.out.println("LENGTH OF ARRAY LIST = "+al1.size());
                        break;
                case 5:System.out.println("Enter position :");
                        int pos2=Integer.parseInt(sc.nextLine());
                        System.out.println("VALUE AT "+pos2+"= "+al1.get(pos2-1));
                        break;
                case 6:System.out.println("\nARRAY LIST");
                        for(String i:al1)
                        System.out.println(i);
                        break;
                case 7:Collections.sort(al1);
                        System.out.println("SORTED ARRAY LIST ="+al1);
                        break;
                case 8:break;
            }
       }while(ch!=8);
    }
}