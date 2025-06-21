package Live_test;

public class Type_Casting {
    public static void main(String[] args) {
        int a=10;
        float b=3.5f;
        //Expression result: 23 Implicit casting: 13.5 Explicit casting: 13
        b=a+b; //implicit cast
        System.out.println("Implicit casting :" +b);
        //int b1=int(b);
    }
}
