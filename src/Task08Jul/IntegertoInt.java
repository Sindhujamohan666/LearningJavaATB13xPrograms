package Task08Jul;

public class IntegertoInt {
   /* Task 4: Convert Integer to int using Unboxing

📘 Description:
    Create an Integer object and convert it back to primitive using unboxing.
📤 Expected Output:
Integer object: 20
Unboxed primitive: 20  */
   public static void main(String[] args) {
       Integer a=20;
       int b=a; //Unboxing
       System.out.println("Integer object: "+a);
       System.out.println("Unboxed primitive: "+b);
   }
}
