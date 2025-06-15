package ex_08_Increment_Decrement_Op;

public class Task5 {
    public static void main(String[] args) {
        int a = 5;

        int b = a++ + ++a;

        System.out.println("a: " + a);

        System.out.println("b: " + b);

        //Line no | a|Exp
        //5  |5 |NA
        //7  |  6 |5--a++
        //7  |  7 |7--++a b=5+7=12
        //



    }
}
