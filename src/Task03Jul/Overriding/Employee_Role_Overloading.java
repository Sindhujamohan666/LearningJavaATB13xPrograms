package Task03Jul.Overriding;

public class Employee_Role_Overloading {
    public static void main(String[] args) {
        //extends necessary for overriding
        Employee_Role_Overloading e1=new Employee_Role_Overloading();
        e1.role();
        Manager m1=new Manager();
        m1.role();
        Clerk c1=new Clerk();
        c1.role();
        Tester t1=new Tester();
        t1.role();
    }
    void role(){
        System.out.println("General Employee");
    }
}

class Manager extends Employee_Role_Overloading{
    void role(){
        System.out.println("Manager");
    }
}
class Clerk extends Employee_Role_Overloading{
    void role(){
        System.out.println("Clerk");
    }
}
class Tester extends Employee_Role_Overloading{
    void role(){
        System.out.println("Tester");
    }
}