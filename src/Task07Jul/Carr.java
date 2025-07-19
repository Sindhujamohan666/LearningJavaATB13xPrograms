package Task07Jul;

public class Carr implements SpeedLimit {
    /*Interface Constants

🔶 Objective:
Demonstrate how to use constants (public static final variables) in interfaces.
 🔶 Steps:
Create an interface SpeedLimit with a constant MAX_SPEED = 120.
In a class Car, access and print the constant.
Do not modify the constant—it should behave like a final value.
🔶 Expected Output:
Max Speed is: 120   */
    public void displaySpeed(){
        System.out.println("Max Speed is: "+MAX_SPEED);
    }

    public static void main(String[] args) {
        Carr c=new Carr();
        c.displaySpeed();

    }
}
interface SpeedLimit {
    int MAX_SPEED = 120; // implicitly public, static, and final
}