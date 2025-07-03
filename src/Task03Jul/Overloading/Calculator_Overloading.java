package Task03Jul.Overloading;

public class Calculator_Overloading {
    public static void main(String[] args) {
      math m1=new math(); //obj creation
        System.out.println(m1.add(2,4));
        System.out.println(m1.add(2.5,7));

    }

}
class math{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}