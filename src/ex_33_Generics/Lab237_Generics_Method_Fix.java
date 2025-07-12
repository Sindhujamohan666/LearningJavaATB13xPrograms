package ex_33_Generics;

public class Lab237_Generics_Method_Fix {
    public static void main(String[] args) {
        //using generic i can pass any datatype.
        display(3,4);
        display(3.14,4.45);
        display("pramod","dutta");

    }

   static <T> T display(T a, T b,T c){
       System.out.println(a);
       System.out.println(b);
       return null;
   }
   static <T> void display(T a,T b){
       System.out.println(a);
       System.out.println(b);
    }
}
