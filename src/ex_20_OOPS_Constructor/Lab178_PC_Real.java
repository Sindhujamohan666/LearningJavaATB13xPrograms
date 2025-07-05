package ex_20_OOPS_Constructor;

public class Lab178_PC_Real {
    public static void main(String[] args) {
        Person p1=new Person("Isha",987654687,"abc");
        System.out.println(p1.name);
        Person p2=new Person("shiva",987655655,"xyz");
    }

}
class Person{
    String name;
    long phone;
    String address;
    Person(String name_user){
        this.name=name_user;
    }
    Person(String name_user,long phone_user,String address_user ){
        this.name=name_user;
        this.phone=phone_user;
        this.address=address_user;
    }
    Person(String name_user,long phone_user){
        this.name=name_user;
        this.phone=phone_user;
    }
}
