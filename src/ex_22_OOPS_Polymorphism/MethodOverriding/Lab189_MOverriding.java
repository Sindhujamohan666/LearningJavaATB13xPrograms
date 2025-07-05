package ex_22_OOPS_Polymorphism.MethodOverriding;

public class Lab189_MOverriding {
    public static void main(String[] args) {

    }
    class Animal{
       void sound(){
           System.out.println("Default sound");
       }
       void A(){}

    }
    class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("bark");
        }
        void methodoverload(){

        }
        void methodoverload(int a){

        }
    }
}
