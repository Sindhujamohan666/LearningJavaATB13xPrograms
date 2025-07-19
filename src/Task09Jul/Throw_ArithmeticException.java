package Task09Jul;

public class Throw_ArithmeticException {
    /* Task 8: Throw Exception and Catch It

📘 Description:
Manually throw an exception using throw new ArithmeticException() and catch it. */
    public static void main(String[] args) {
        try{
            int result=10/0;
            throw new ArithmeticException("This is a Divide by Zero error");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
