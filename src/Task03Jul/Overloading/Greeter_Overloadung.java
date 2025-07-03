package Task03Jul.Overloading;

public class Greeter_Overloadung {
    public static void main(String[] args) {
        Greeter g1=new Greeter();
        g1.greet();
        g1.greet("sindhu");
    }
}
class Greeter{
    void greet(){
        System.out.println("Hello");
    }
    void greet(String name){
        System.out.println("Hello "+name);
    }
}