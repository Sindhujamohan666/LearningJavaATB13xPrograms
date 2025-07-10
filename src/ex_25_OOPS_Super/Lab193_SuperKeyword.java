package ex_25_OOPS_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
    Car c=new Car();
    c.display();
    }
}
class Vehicle{
    public int maxSpeed=180;

    public Vehicle() {
        System.out.println("Default constructor-parent");
    }
    public Vehicle(int a){
        System.out.println("Parameterized constructor-parent");
        System.out.println("Parameterized constructor-parent" +a);
    }
    // Method Overloading - Same, same name function with different arguments.
    void message(int a) {
        System.out.println("Type 2");
    }

    void message() {
        System.out.println("Type 1");
    }

    int message(String a) {
        System.out.println("Type 4");
        return 0;
    }


    void display() {
        System.out.println("Vehicle Parent");
    }
}
class Car extends Vehicle{
    private int maxSpeed = 281;  //private variable encapsulated with getter and setter
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
   Car(){
        super(); //parent constructor call
   }
   Car(int a){
        super(10);//parameterized constructor call
   }
    @Override
    void display() {
        System.out.println(super.maxSpeed); //  instance variable call
        System.out.println(this.maxSpeed); // This means my variable call.
        System.out.println("Hi Override!");
    }
}