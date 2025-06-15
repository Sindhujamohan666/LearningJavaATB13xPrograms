package ex_08_Increment_Decrement_Op;

public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println("a: " + a + ", b: " + b);

        //line no |a |EXp
        //5   |5 |NA
        //6   |6 |5
        //7   | 6 |5
    }


}
