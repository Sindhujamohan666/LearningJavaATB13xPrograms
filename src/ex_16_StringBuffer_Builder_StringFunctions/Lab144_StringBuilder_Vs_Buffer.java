package ex_16_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s1="sindhu";
        String s2=new String("Sindhu");

        StringBuffer stringbuffer=new StringBuffer("Sindhu");
        StringBuilder stringbuilder=new StringBuilder("Sindhu");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(stringbuffer);
        System.out.println(stringbuilder);

    }
}
