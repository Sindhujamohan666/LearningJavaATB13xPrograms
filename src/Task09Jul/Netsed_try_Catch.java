package Task09Jul;

public class Netsed_try_Catch {
    /* ✅ Task 4: Nested Try-Catch

📘 Description:
Write a program with a try-catch block inside another try-catch block.
Example: Outer block for ArithmeticException, inner for ArrayIndexOutOfBoundsException. */
    public static void main(String[] args) {
        try{
            int result=10/0;
            try{
                int[] arr={1,2,3};
                int b=arr[5];
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
