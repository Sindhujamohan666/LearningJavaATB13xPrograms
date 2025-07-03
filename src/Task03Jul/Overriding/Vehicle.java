package Task03Jul.Overriding;

public class Vehicle {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        v1.start();
        Bike b1=new Bike();
        b1.start();
        Car c1=new Car();
        c1.start();
    }
    void start(){
        System.out.println("Start the vehicle");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Kick start the bike");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Turn the key to start the car");
    }
}
