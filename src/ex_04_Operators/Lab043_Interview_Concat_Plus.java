package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Sindhuja";
        String last_name = "Mohan";

        int a = 10;
        int b = 10;

       System.out.println(first_name + last_name + a + b); //op-SindhujaMohan1010
      System.out.println(a + b + first_name + last_name);//op-20SindhujaMohan

       System.out.println(first_name + last_name + (a + b));//op-SindhujaMohan20

        // BODMAS - Bracket of Div, mul, add, sub
    }
}
