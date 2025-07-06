package Task04Jul;

public class Constructor_Super {
    //Access parent class constructor using super()
    public static void main(String[] args) {
       Child c1=new Child(); //constructor call
        c1.mthd();
        c1.var();

    }
    //Default constructor
    /*This is a default variable not accessible in diff package Animal
    It is accessible only within same package
     */
    int a=10;
    Constructor_Super(){
        System.out.println("I am a default constructor");
    }
    //Parameterized constructor
    Constructor_Super(int a){
        System.out.println("I am a parameterized constructor with value "+a);
    }
    void mthd(){
        System.out.println("I am a parent class method");
    }
}

class Child extends Constructor_Super{
    Child(){
       //super(10);  //parent class  parameterized constructor call
        super();    //parent class default constructor call

    }
    void mthd(){
        System.out.println("I am a child class  method");
        super.mthd();   //calls parent class method
    }
    void var(){
        System.out.println(super.a);//parent class variable call
    }
}