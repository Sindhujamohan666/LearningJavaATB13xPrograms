package Task02Jul.Animal_Simulator;

public class Animal_Simulator {
    /* Create a base class Animal with a method makeSound().
    Then create a derived class Cat that has a method meow().
    In the main method, call both methods using the Cat...
     */
    public static void main(String[] args){
        cat c1=new cat();
        c1.make_sound();
        c1.meow();
    }
}

class Animal{
    void make_sound(){
        System.out.println("sound");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("meow");
    }
}