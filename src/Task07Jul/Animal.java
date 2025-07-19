package Task07Jul;

abstract class Animal {
    /*1. Animal Sound - Abstract Method Implementation
Description: Create an abstract class Animal with an abstract method makeSound().
 Extend it in Dog and Cat.
     🔶 Expected Output:
Dog barks
Cat meows */
        abstract void makeSound();//abstract method has no implementation

    public static void main(String[] args) {
        Dog d=new Dog();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();
    }
}
class Dog extends Animal{
    void makeSound(){   //abstract method implementation
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void makeSound(){   //abstract method implementation
        System.out.println("Cat meows");
    }
}