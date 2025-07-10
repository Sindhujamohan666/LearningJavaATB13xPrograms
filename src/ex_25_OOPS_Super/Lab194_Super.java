package ex_25_OOPS_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound();
    }
}
class God{
    public int gold=100;
    void sound(){
        System.out.println("GOD !!..");
    }
    God(){
        System.out.println("God DC!");
    }
}
class Animal extends God{
    @Override
    void sound(){
        super.sound(); //parent method call
    }
    Animal(){
        super();//parent Defailt constructor call
    }
    Animal(int a,int b){
        System.out.println(a+b);//parent parameteized constructor call
    }
    void test(){
        System.out.println(super.gold);
    }
}