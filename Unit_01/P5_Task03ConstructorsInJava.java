package College.Unit_01;

public class P5_Task03ConstructorsInJava {
    public static void main(String[] args) {

        ABC4 obj= new ABC4(2);
        ABC4 obj1= new ABC4(1);
        System.out.println(obj.a);
        System.out.println(obj1.a);

        obj.display();
        obj1.display();

    }
}
class ABC4
{
    int a;

    ABC4()
    {
        a=100;
    }

    ABC4(int a)
    {
        this.a=a*100;
        System.out.println(this.a);
        System.out.println(a);
    }

    void display()
    {
        int a=10;
        System.out.println(this.a);
    }
}