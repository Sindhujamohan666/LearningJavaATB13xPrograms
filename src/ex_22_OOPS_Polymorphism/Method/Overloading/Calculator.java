package ex_22_OOPS_Polymorphism.Method.Overloading;

public class Calculator {
    public static void main(String[] args) {
        Calc c1=new Calc();
        c1.add(2,3);
        c1.add(2.5d,3.2d);
    }
}
class Calc{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}