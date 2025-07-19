package Task08Jul;

public class InttoInteger {
    /* Task 3: Convert int to Integer using Autoboxing

📘 Description:
Declare an int, assign a value, and convert it to Integer using autoboxing.
📤 Expected Output:
Primitive value: 10
Wrapper object: 10 */
    public static void main(String[] args) {
        int a=10;
        Integer b=a; //Autoboxing
        System.out.println("Primitive value: " +a );
        System.out.println("Wrapper Object: " +b );
    }
}
