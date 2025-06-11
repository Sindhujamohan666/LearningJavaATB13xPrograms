package ex_01_Java_Basic;

public class Lab002_mainoverloading {
     public static void main(String[] args) {
          System.out.println("Hello main");
     }
     /*It is possible to have 2 main method but with diff datatype which is also called
     as method/function(same in java) overloading .but exec always starts with
     public static void main(String[] args)*/

     public static void main(int args) {
          //this will not be executed
          System.out.println("10");
     }
}

