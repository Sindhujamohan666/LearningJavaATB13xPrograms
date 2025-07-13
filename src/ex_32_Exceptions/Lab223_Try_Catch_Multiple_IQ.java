package ex_32_Exceptions;

public class Lab223_Try_Catch_Multiple_IQ {
    public static void main(String[] args) {
        try{
            int a=10/0;
        }catch(Exception e){
            //gives a custom message for exception instead of red error like
            System.out.println(e.getMessage());
        }
    }
}
