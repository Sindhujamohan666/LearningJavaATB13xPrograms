package Task07Jul;

abstract class Abstract_Vs_Concrete {
    /* 5. Abstract vs Concrete Method
🔶 Objective:
Understand how abstract classes can contain both abstract methods (which must be implemented
in the subclass) and concrete methods (which can be used as-is).
     🔶 Steps to Create:
Create an abstract class Parent.
Define one abstract method void show().
Define one concrete method void display() that prints a message.
Create a class Child that extends Parent.
Implement the show() method inside Child.
In the main() method, create an object of Child and call both display() and show(). */
    abstract void show();
    public void display(){
        System.out.println("Non-abstract method");
    }
}
class Child extends Abstract_Vs_Concrete{
     void show(){
         System.out.println("Abstract method implementation");
     }

    public static void main(String[] args) {
        Child child=new Child();
        child.show();
        child.display();
    }
}
