package ex_22_OOPS_Polymorphism.Method.Overloading;

public class WebAutomation {
    public static void main(String[] args) {
        Browser b1=new Browser();
        b1.startBrowser("chrome");
    }
}

class Browser{
    void startBrowser(){
        System.out.println("I am a default browser");

    }
    String startBrowser(String browser){
        System.out.println("Starting browser" +browser);
        return browser;
    }
}