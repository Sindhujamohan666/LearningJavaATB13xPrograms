package ex_30_ENUM;

public class Lab210_ENUM {
    public static void main(String[] args) {
        System.out.println(DAYS.FRIDAY); //direct access using enum name
        System.out.println(PROJECT_NAMES.google); //direct access using enum name
    }
}
enum DAYS{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
enum PROJECT_NAMES{
    google,restassured,katalon,vwo;
}
//class A{
//    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};//not a good idea
//}