package Task09Jul;

public class Arithmetic_Exception {
    /*Task 1: Basic Try-Catch with ArithmeticException

📘 Description:
    Divide a number by zero and handle the exception.

🧤 Expected Output:
    Catch ArithmeticException and print a friendly message. */
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        try{
            int result=num1/num2;
        }catch(ArithmeticException e){
            System.out.println("Divide by Zero is not allowed");
        }
    }
}
