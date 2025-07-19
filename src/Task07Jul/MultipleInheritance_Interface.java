package Task07Jul;

public class MultipleInheritance_Interface implements Printable,Showable {
    /*6. Multiple Inheritance Using Interfaces
🔶 Objective:
Show how a class in Java can implement multiple interfaces to achieve multiple inheritance.
🔶 Steps:
Create two interfaces: Printable and Showable.
Each interface should have a method: print() and show() respectively.
Create a class Document that implements both interfaces.
Implement both methods in the Document class.
In the main() method, create a Document object and call both methods. */
    public void print(){
        System.out.println("Printing Document");
    }
    public void show(){
        System.out.println("Showing Document");
    }

    public static void main(String[] args) {
        MultipleInheritance_Interface mi=new MultipleInheritance_Interface();
        mi.print();
        mi.show();
    }
}
interface Printable{
    void print(); //interface methods cant have body
}
interface Showable{
    void show();//interface methods cant have body
}