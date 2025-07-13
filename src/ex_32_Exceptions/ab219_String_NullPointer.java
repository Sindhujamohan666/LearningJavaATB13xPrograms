package ex_32_Exceptions;

public class ab219_String_NullPointer {
    public static void main(String[] args) {
        String name=null;// java.lang.NullPointerException
        name.trim();
    }
}
