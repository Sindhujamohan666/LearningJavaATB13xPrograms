package Task04Jul;

public class Student {
    //Understand how public methods are accessible from anywhere.
    public void showInfo(){
        System.out.println("Student info");
        //This public method ia also called in animal class
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.showInfo(); //calling public mthod within same class

    }
}
class Baby extends Student {
    void Baby(){
        showInfo();//calling parent class public method
    }
}
