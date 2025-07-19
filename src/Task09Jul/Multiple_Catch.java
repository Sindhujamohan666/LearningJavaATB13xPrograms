package Task09Jul;

public class Multiple_Catch {
    /*Task 2: Try-Catch with Multiple Catch Blocks

📘 Description:
    Write code that may throw either ArithmeticException or ArrayIndexOutOfBoundsException
    and handle them with multiple catch blocks.

🧤 Expected Output:
    Print which exception occurred */
    public static void main(String[] args) {
        int a=10;
        int[] arr ={1,2,3,4,5};
        try{
            int result1=a/0;
            int result2=arr[5];
            System.out.println("Exception occured");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Arithmetic exception");
        }
    }
}
