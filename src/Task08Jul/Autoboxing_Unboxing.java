package Task08Jul;

public class Autoboxing_Unboxing {
    /*Task 1: Autoboxing and Unboxing

📘 Description:
Demonstrate automatic conversion from int to Integer (Autoboxing) and back from Integer to int (Unboxing).
📤 Expected Output:
Primitive: 50
Wrapper: 50
Unboxed again: 50  */
    public static void main(String[] args) {
        int a=50;
        System.out.println(a);
        Integer b=a;
        b.byteValue(); //Integer can access many inbuilt methods
        System.out.println(b);
        int c=b;
        System.out.println(c);
        //c.byteValue();-->primitive methods cant access any functions
    }
}
