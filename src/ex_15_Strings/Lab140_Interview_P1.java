package ex_15_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        String s1 = "Hello"; //String constant pool only one
        String s4 = "Hello"; //String constant pool
        String s10 = "Hello"; //String constant pool

        String s2 = new String("Hello"); //Object Area (3 Hello created)
        String s3 = new String("Hello"); //Object Area
        String s5 = new String("hello"); //Object Area

    }
}
