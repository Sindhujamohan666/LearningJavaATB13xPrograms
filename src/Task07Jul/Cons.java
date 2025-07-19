package Task07Jul;

abstract class Cons {
   /* Description: Show that abstract class can have constructor. Print message from constructor and method.
🔶Expected Output:
Abstract class constructor called
Method from abstract class   */
   Cons(){
      System.out.println("Abstract class constructor calld");
   }
   public void method(){
      System.out.println("Method from abstract clas");
   }
}
class Call extends Cons{
   public static void main(String[] args) {
      //Cons c=new Cons();-->Cant create object for an abstract class
      Call c=new Call();//object creation of concrete class
      c.method();
   }
}
