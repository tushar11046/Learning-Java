package College.Assignment_01;

public class Q2 {
    public static void main(String[] args)
    {
        Calling c1=new Calling();
        Calling c2=new Calling();
        Calling c3=new Calling();

        c1.callobject();
        c2.callobject();
        c3.callobject();

        System.out.println("Total Calls: "+Calling.count);
    }
}
class Calling
{
    static int count=0;
    void callobject()
    {
        count++;
    }
}
