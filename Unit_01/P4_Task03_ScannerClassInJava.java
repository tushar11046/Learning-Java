package College.Unit_01;
import java.util.Scanner;

public class P4_Task03_ScannerClassInJava {
    public static void main(String[] args) {

        Scanner myObj1=new Scanner(System.in); //create a scanner object
        Scanner myObj2=new Scanner(System.in);

        //Read the First-Token : (_ space_bar)
        String firstName= myObj1.next();
        System.out.println("Name is: "+firstName+"\n");

        String name=myObj2.nextLine(); //(\n)
        String name2=myObj2.nextLine(); //(\n)

        System.out.println("Name is: "+name+"\n");
        System.out.println("Name is: "+name2+"\n");

        boolean b=myObj2.nextBoolean();
        System.out.println(b+"\n");

        myObj1.close();
        myObj2.close();
    }
}
