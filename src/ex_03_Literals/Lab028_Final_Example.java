package ex_03_Literals;

public class Lab028_Final_Example {
    public static void main(String[] args) {
        int local=0;
        System.out.println(local);
        final float PI=3.14f;
        //cannot reassign final variable
        //PI=3.13f;
        System.out.println(PI);
    }
}
