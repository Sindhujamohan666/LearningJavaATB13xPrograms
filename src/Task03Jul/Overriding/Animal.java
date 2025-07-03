package Task03Jul.Overriding;

public class Animal {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.sound();
        Dog d1=new Dog();
        d1.sound();
        Cat c1=new Cat();
        c1.sound();
        Cow c2=new Cow();
        c2.sound();
    }
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow");
    }
}
class Cow extends Animal{
    @Override                   //can/cannot be mentioned
    void sound(){
        System.out.println("Moo");
    }
}
