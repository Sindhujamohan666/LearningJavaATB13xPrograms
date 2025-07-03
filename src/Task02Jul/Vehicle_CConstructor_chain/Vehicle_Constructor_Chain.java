package Task02Jul.Vehicle_CConstructor_chain;

public class Vehicle_Constructor_Chain {
    /*Create a class Vehicle with a constructor that prints "Vehicle is ready".
   Create a class Bike that extends Vehicle and prints "Bike is ready" in its constructor.
   Create an object of Bike in the main method and observe constructor call order.
    */
    public static void main(String[] args) {
        Bike b1=new Bike(); //constructor call first calls vehicle then bike

    }
}
 class Vehicle {
    Vehicle(){//constructor
        System.out.println("Vehicle is ready");

    }
}
class Bike extends Vehicle {
    Bike(){ //constructor
        System.out.println("Bike is ready");
    }
}
