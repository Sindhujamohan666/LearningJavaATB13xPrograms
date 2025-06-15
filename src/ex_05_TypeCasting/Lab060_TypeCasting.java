package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone=98765432101l;
       //short s=phone;--implicit not allowed in narrowing
        short s1=(short)phone;
        System.out.println(s1);//op --6875
    }
}
