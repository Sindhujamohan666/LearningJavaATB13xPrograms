package ex_04_Operators;

public class Lab056_Interview_QnA {
    public static void main(String[] args) {
        short s = 10;
        char c = 'A';
        String s1 = "A";
        System.out.println(c+s); //75
        System.out.println(c); //A
        System.out.println(c+c); // 130-char also belongs to integral type adds ASCII with +
        System.out.println(c+s1);//AA-with string char concatenates
    }
}
