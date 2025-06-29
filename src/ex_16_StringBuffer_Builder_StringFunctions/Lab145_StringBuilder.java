package ex_16_StringBuffer_Builder_StringFunctions;

public class Lab145_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("madam");
        System.out.println(sb.reverse());
        System.out.println(sb.append("cool"));

        String s1="Hello";
        String s2="World";
        String concat=s1+s2;
        System.out.println(concat);
        System.out.println(s1);
        System.out.println(s2);
    }
}
