package ex_08_Increment_Decrement_Op;

public class Task6 {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x;

        System.out.println("x = " + x + ", y = " + y);

        //x=5;
        //x++=5  x=6
        //++x=7  x=7
        //x++=7  x=8
        //++x=9  x=9
          //tot:28
    }
}
