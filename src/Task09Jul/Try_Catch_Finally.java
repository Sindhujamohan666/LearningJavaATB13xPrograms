package Task09Jul;
import java.util.Scanner;
public class Try_Catch_Finally {
    /* ✅ Task 3: Try-Catch-Finally

📘 Description:
Create a program with a try, a catch, and a finally block.
Demonstrate that the finally block always executes. */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a(int)");
        int a=sc.nextInt();
        try{
            int result=10/0;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This block will always be executed");
            sc.close();
        }
    }

}
