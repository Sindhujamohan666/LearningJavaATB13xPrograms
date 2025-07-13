package ex_32_Exceptions;

public class Lab224_Try_IQ {
    public static void main(String[] args) {
        String s1=null;
        try{
            s1.trim();
            int a=10/0;
            //It is good practise to add multiple exception types with |
        }catch(ArithmeticException |NullPointerException e){
            System.out.println("Null or Arith exception");
        }catch(Exception e){
            System.out.println("Yes");
        }
        System.out.println("End");
    }
}
