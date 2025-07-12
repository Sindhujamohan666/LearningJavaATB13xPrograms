package ex_31_Wrapper_Class;

public class Lab214_Wrapper_Conversion {
    public static void main(String[] args) {
        int a=10;
        Integer b=a;// This Boxing -> automatically JVM will store the value
        // Primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue());
        System.out.println(Integer.MIN_VALUE);

        Integer a2 = 42;
        int v = a2; // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(v);
        //System.out.println(v.intvalue());--Primitive cant access values.
    }

}
