package ex_20_OOPS_Constructor;

public class Lab177_PC {
    public static void main(String[] args) {
        BabyA b1=new BabyA();
        BabyA b2=new BabyA();
        System.out.println(b1.name);
        System.out.println(b1.name);

        BabyA b3=new BabyA("shiva","6766",2025,01,01);
        BabyA b4=new BabyA("Isha","6767",2025,02,01);
        System.out.println(b4.name);
    }
}
class BabyA{
    String name;
    String aadhar_number;
    int year;
    int month;
    int day;
    //Default constructor
    BabyA(){
        name="Gugu";
        aadhar_number="0000";
        year=1971;
        month=01;
        day=01;
    }
    //Parameterized constructor
    BabyA(String name_user,String aadhar_number_user,int year_user,int month_user,int day_user){
        this.name=name_user;
        this.aadhar_number=aadhar_number_user;
        this.year=year_user;
        this.month=month_user;
        this.day=day_user;

    }
}
