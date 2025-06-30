package ex_19_OOPS;

public class Person {
    // These are called properties, attributes, instance variables, member variables.
    String name;
    int age;
    String height;
    String gender;
    boolean is_married;

    void walk(){
        System.out.println("Walking");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
    String eat(String food){
        System.out.println("Eating");
        return null;
    }
    String food(int a){
        System.out.println("food");
        return null;
    }
}
