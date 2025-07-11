package ex_28_IIB;

public class Lab203_IIB {
    // ```
    //IIB
    //Instance initialization Block == IIB
    //I will be executed each time when Object is created.
    //```
    public static void main(String[] args) {
       A a1=new A();
       A a2=new A();

    }
}
class A{
    A(){
        System.out.println("Direct constructor...");
    }
    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file

    }

    {
        System.out.println("Hi, I am IIB 2");
    }

    {
        System.out.println("Hi, I am IIB 3");
    }
    static {
        //executes only once in the very first
        System.out.println("Static");
    }
}
