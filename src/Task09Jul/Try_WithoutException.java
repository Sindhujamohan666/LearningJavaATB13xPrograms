package Task09Jul;

public class Try_WithoutException {
    /*Try Block Without Exception

📘 Description:
Write a try block that does not throw any exception.
Verify that the catch block is skipped and finally still runs.  */
    public static void main(String[] args) {
        try{
            int result=10/5;
        }catch(Exception e) {
            System.out.println(e.getMessage()); //catch skipped as there is no exception
        }finally{
            System.out.println("No exception -finally");
        }
    }
}
