package Task02Jul.Multilevel_login_System;

public class Multilevel_login_System {
    public static void main(String[] args) {
        SuperAdmin sa=new SuperAdmin();
        sa.login();
        sa.accessAdminPanel();
        sa.shutdownSystem();
    }
}

class User  {
    void login(){
        System.out.println("Please login");
    }
}
class AdminUser extends User {
    void accessAdminPanel(){
        System.out.println("access");
    }
}
class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("shut down system");
    }
}

