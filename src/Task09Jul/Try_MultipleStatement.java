package Task09Jul;

public class Try_MultipleStatement {
    /*✅ Task 10: Try With Multiple Statements

📘 Description:
Write multiple statements in a try block.
Ensure if the first fails, the rest are not executed, and control goes to catch. */
    public static void main(String[] args) {
        try{
            int result=10/0;
            String b=null;
            int c=5/0;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
