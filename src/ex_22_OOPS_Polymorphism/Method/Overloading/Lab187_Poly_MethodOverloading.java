package ex_22_OOPS_Polymorphism.Method.Overloading;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperations mo=new MathOperations();
        int r1=mo.add(3,4);
        int r2=mo.add(3,4,5);
        double r3=mo.add(2.5d,6.1d);
        String r4=mo.add("sindhuja","mohanasundaram");
    }

}
class MathOperations {
// In the same class, When you have a method wit same
// Same name methods but different arguments and different return type.
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }
}