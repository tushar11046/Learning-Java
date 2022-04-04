package College.Unit_01;

/*
 * -Variables in Java is a data container that saves the data values during the program execution.
 * Types of Variables:
  -In Java there are three types of variables:
      .Local Variables-declared inside the body of a method

      .Instance Variables - Instance Variables are defined without the static keyword.
      -They are defined outside a method declaration.
      -they are object specific and are known as instance variables.

      .Static Variables -
      -They are defined with the static keyword
      -Static Variable are initialized only once,at the start of program execution.
      -These static variables should be initialized first,before the initialization of any variable.

 -Data Types in Java ?
  .Reference OneNote
 */

public class P3_Task01_VariablesAndDataTypesInJava {
    static int q=11;
    public static void main(String[] args) {
        //Valid Declaration
        int a,b,c;
        float pi;
        double d;
        char e;

        //Valid Initializations
        pi=3.14f;
        d=20.22d;
        e='v';

        a=10;
        b=10;
        c=10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(pi);
        System.out.println(d);
        System.out.println(e);

        int MyNum=5;//Integer(Whole Number)
        float MyFloat=99f;//Floating Point Number
        char MyLetter ='D';//Character
        boolean MyBool=true;//Boolean
        String MyText="Hello";//String

        System.out.println(MyNum);
        System.out.println(MyFloat);
        System.out.println(MyLetter);
        System.out.println(MyBool);
        System.out.println(MyText);

        /*
         * Java Variables Type Conversion and Type Casting:Details are in OneNote
         */
        double f;
        int i=10;
        f=i;//Type Conversion

        double g=10;
        int j;
        j=(int)g;//type casting

        System.out.println(f);
        System.out.println(i);
        System.out.println(g);
        System.out.println(j);

        byte k=10;//1 byte
        boolean l=true;//1 bit=true or false any
        long m=10l;
        float n=1.2f;
        double o=1.2d;

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);

        System.out.println(ABC.j);//data +function/methods
        //ABC.display();

        ABC obj1=new ABC();
        System.out.println(obj1.i++);
        System.out.println(obj1.i);

        ABC obj2=new ABC();
        System.out.println(obj2.i);

        //System.out.println(obj1.j++);
        //System.out.println(obj1.j);
        //System.out.println(obj2.j);

        System.out.println(ABC.j++);
        System.out.println(ABC.j);

        ABC.typeConversionAndTypeCasting();
    }
    int r=10;
    void display()
    {
        int a=5;//local Variable
        System.out.println("Tis is Display Method:");
        System.out.println(a);
    }
}
class ABC
{
    static int j=10;//class variable /Static Variable
    int i=10;//Instance Variable

    static void display()
    {
        int a=5;//local variable
        System.out.println("Tis is Display Method:");
        System.out.println(a);
    }
    static void typeConversionAndTypeCasting() {
        /*
         * double f;//8 bytes=64 bits/slots int i=10;//4 bytes=32bits/slots f
         * =i;//Type Conversion System.out.ptinyln(f);
         *
         * double g=10;//64 int j;//32j=(int)g;
         */

        double f;//64 slots
        int i=10;//32 slots
        f=i;//Type Conversion
        System.out.println(f);

        double g=10;//64
        int j;//32
        j=(int)g;//type Casting

        //32 bits=64 bits

        System.out.println(i);
        System.out.println(j);
    }
}
