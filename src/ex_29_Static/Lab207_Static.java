package ex_29_Static;

public class Lab207_Static {
}
class B{
    static{
        System.out.println("SIB is called once when class is loaded");
    }
    int a=10;
    static int b=10;
    void display(){
        System.out.println(b);
        System.out.println("Non static F(n)");
    }
    static void commontoAll(){
        System.out.println("static function");
        //System.out.println(a);-->non-static variable not accessible in static
    }
    static class C{
        // // Whatever you are going to use in the automation also. Good news.
    }
}