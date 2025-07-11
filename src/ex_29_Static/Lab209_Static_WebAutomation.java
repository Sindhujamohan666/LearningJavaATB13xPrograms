package ex_29_Static;

public class Lab209_Static_WebAutomation {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(Automation.driver);//accessing using class name-static

        Automation t2 = new Automation();
        Automation t3 = new Automation();

        System.out.println(t2.driver);
        System.out.println(t3.driver);

    }


}
class Automation{
    static String driver="Chrome";//driver becomes common to all obj due to static
}