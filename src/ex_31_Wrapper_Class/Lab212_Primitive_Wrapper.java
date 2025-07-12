package ex_31_Wrapper_Class;

public class Lab212_Primitive_Wrapper {
    public static void main(String[] args) {
        int a = 10; // primitive

        // This is not Object
        // It will not have attribute or Behaviour

        // char, short, byte, long, float, double, - we will avoid them now


        // We will use the Wrapper classes,
        // Character, Boolean, Short, Long, Double, Float
        Integer age=10; //We have different functions to be used with wrapper
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
    }
}
