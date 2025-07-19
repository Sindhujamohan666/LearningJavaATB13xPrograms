package Task07Jul;

public class Car implements Vehicle {
    /* Interface with Default and Static Method
🔶 Objective:
Learn how to use default and static methods in interfaces (since Java 8).
🔶 Steps:
Create an interface Vehicle.
Add a default method start() that prints "Vehicle started".
Add a static method fuelType() that prints "Fuel type is Petrol".
Create a class Car that implements Vehicle.
In main(), create a Car object and call start().
Call Vehicle.fuelType() without creating an object.  */
    public static void main(String[] args) {
        //Vehicle c= new Vehicle();--object cannot be instantiated for interface
        Car c=new Car();
        c.start();
        Vehicle.fuelType(); //static can be called directly by interface/class name.Object not needed.
    }

}
interface Vehicle{
    default void start(){         //default method
        System.out.println("Vehicle started");
    }
    static void fuelType(){
        System.out.println("Fuel type is Petrol");
    }
}