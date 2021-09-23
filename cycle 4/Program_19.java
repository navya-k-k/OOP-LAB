import java.util.*;

public class Program_19

{

    public static void main(String[] args)

    {

        int ch,n;

        Scanner sc=new Scanner(System.in);

        LinkedList<Integer> l1=new LinkedList<Integer>();

        LinkedList<Integer> l2=new LinkedList<Integer>();

        do

        {

            System.out.println("\n---MENU--\n\n1.ADD\n2.ADD ALL\n3.REMOVE\n4.REPLACE\n5.GET FIRST\n6.GET LAST\n7.ADD FIRST\n8.ADD LAST\n9.CLEAR\n10.EXIT");

            System.out.println("Enter your choice:");

            ch=sc.nextInt();

            switch(ch)

            {

                case 1:System.out.println("Enter the Number:");

                        n=sc.nextInt();

                        l1.add(n);

                        System.out.println("\n--> UPDATED LINKED LIST = "+l1);

                        break;

                case 2:System.out.println("COPY OF PREVIOUS LINKED LIST ");

                        l2.addAll(l1);

                        System.out.println("\n--> NEW LINKED LIST = "+l2);                    

                        break;

                case 3:System.out.println("Enter position :");

                        int pos1=sc.nextInt();

                        l1.remove(pos1-1);

                        System.out.println("\n--> UPDATED LINKED LIST = "+l1);

                        break;

                case 4:System.out.println("Enter position :");

                        int pos=sc.nextInt();

                        System.out.println("Enter new value:");

                        n=sc.nextInt();

                        l1.set(pos-1,n);

                        System.out.println("\n--> UPDATED LINKED LIST = "+l1);

                        break;

                case 5:System.out.println("FIRST VALUE = "+l1.getFirst());

                        break;

                case 6:System.out.println("LAST VALUE = "+l1.getLast());

                        break;

                case 7:System.out.println("Enter value :");

                        n=sc.nextInt();

                        l1.addFirst(n);

                        System.out.println("\n--> UPDATED LINKED LIST = "+l1);

                        break;

                case 8:System.out.println("Enter value :");

                        n=sc.nextInt();

                        l1.addLast(n);

                        System.out.println("\n--> UPDATED LINKED LIST = "+l1);

                        break;                

                case 9:l1.clear();

                        System.out.println("\n--> UPDATED LINKED LIST = "+l1);

                        break;

                case 10:break;

            }

       }while(ch!=10);

    }

}