package ex_32_Exceptions;

public class Lab222_Try_Catch_Multiple {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a=10/0;
            //since we know the type of exception we are using it instead of using larger class.
        }catch(ArithmeticException e){ //smaller class followed by bigger -exception
            System.out.println("Are you a fool");
        }catch(Exception e){
            System.out.println("Are you a fool too");
        }
        System.out.println("2");
    }
}
