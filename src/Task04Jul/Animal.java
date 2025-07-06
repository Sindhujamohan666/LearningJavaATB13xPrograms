package Task04Jul;

public class Animal {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.doEat();
        //accessing public method of a class in different package(Student package)
        Student s1=new Student();
        s1.showInfo();


    }
    protected void eat(){
        System.out.println("Animal is eating...");
    }
}
class Dog extends Animal{
    void doEat(){
          eat(); //calling eat method using inheritance (protected can be accessed by child)


    }
}
