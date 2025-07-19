package Task09Jul;

import java.util.Scanner;

public class Generic_Catch {
    /*✅ Task 5: Catch Using Exception (Generic Catch)

📘 Description:
Use only catch(Exception e) to catch any exception.
Throw a NullPointerException or ArithmeticException inside try.  */
    public static void main(String[] args) {

        try{
            boolean throwNullPointer=true; //if false it throws null pointer exception
            if(throwNullPointer) {
                throw new ArithmeticException("This is  null pointer exception");
            }else{
                throw new NullPointerException("This is a arithmetic exception");
            }
            //throw new ArithmeticException("This is arithmetic Exception");//--2 throw shows error

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


}
