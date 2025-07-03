package Task03Jul.Overriding;

public class User_Overriding {
    public static void main(String[] args) {
      /*calling the login() method using base class reference
       to highlight runtime polymorphism.
       User_Overriding uo-->base class reference  ,new AdminUser()-->child class object*/

        User_Overriding uo=new AdminUser();
        uo.login();
        User_Overriding ro=new RegularUser();
        ro.login();

    }
    void login(){
        System.out.println("User Login");
    }
}
class AdminUser extends User_Overriding{
    @Override
    void login(){
        System.out.println("AdminUser Login");
    }
}
class RegularUser extends User_Overriding{
    @Override
    void login(){
        System.out.println("RegularUser Login");
    }
}
