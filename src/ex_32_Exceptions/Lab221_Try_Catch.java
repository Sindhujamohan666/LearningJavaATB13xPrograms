package ex_32_Exceptions;

public class Lab221_Try_Catch {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a=10/0;
            //since we know the type of exception we are using it instead of using larger class.
        }catch(ArithmeticException e){
            System.out.println("Are you a fool");
        }
        System.out.println("2");
    }
}
