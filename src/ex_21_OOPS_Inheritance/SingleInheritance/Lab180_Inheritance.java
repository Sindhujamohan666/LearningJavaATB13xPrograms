package ex_21_OOPS_Inheritance.SingleInheritance;

public class Lab180_Inheritance {
    public static void main(String[] args) {
        Father f1=new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1=new Son();
        System.out.println(s1.gold_f);
        s1.bhk2(); //son can inherit father's as well
        s1.bHK3();
    }
}
class Father{
    int gold_f=1000;
    void bhk2(){
        System.out.println("Father 2bhk");
    }
}
class Son extends Father{
    void bHK3(){
        System.out.println("Father 3bhk");
    }
}
