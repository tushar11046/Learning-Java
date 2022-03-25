package College.Unit_01;

public class P2_task02_ConstantsInJava {

    public static final double pi=3.14;
    //pi=3.18;
    public static void main(String[] args) {

        System.out.println(pi);
        main("Tushar Joshi");
    }
    public static void main(String args)
    {
        System.out.println(pi);
    }
    void add(int a,int b)
    {
        System.out.println(a+b);
        System.out.println(pi);
    }

}

class NewClass{
    final double pi=3.14;
    void add(int a,int b)
    {
        System.out.println(a+b);
        System.out.println(pi);
    }
}
