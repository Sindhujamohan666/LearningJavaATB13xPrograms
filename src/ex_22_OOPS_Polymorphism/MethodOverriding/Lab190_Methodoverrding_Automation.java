package ex_22_OOPS_Polymorphism.MethodOverriding;

public class Lab190_Methodoverrding_Automation {
    public static void main(String[] args) {
        ChromeTC ct=new ChromeTC();
        ct.OpenBrowser();
        FireFoxTC ft=new FireFoxTC();
        ft.OpenBrowser();
        commontoAll ca=new commontoAll();
        ca.OpenBrowser();
        // Dynamic Dispatch
        commontoAll c2 = new ChromeTC();
        c2.OpenBrowser();

        commontoAll c3 = new FireFoxTC();
        c3.OpenBrowser();

    }

}
class commontoAll{
    void OpenBrowser(){
        System.out.println("Starting IE Browser");
    }
}
class ChromeTC extends commontoAll{
    @Override
    void OpenBrowser(){
        System.out.println("starting Chrome Browser");
    }
}
class FireFoxTC extends commontoAll{
    @Override
    void OpenBrowser(){
        System.out.println("starting Firefox browser");
    }
}