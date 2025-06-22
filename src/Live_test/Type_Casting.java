package Live_test;

public class Type_Casting {
    public static void main(String[] args) {
        int a=10;
        float b=3.5f;
        //Expression result: 23 Implicit casting: 13.5 Explicit casting: 13
        float implicit=a+b;
        System.out.println("Implicit casting: "+implicit);
        int explicit=a+(int)b;
        System.out.println("Explicit casting: "+explicit);
        float expressionresult=a+explicit;
        System.out.println("Expression result: "+expressionresult);

    }
}
