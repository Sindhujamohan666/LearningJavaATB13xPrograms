package ex_30_ENUM;

public enum Locators {
    //We are going to access this in Lab211_ENUM
    page_input_email("#login-username"),
    page_input_password("#login-password"),
    page_button("#btn");

    private String locators;
    Locators(String locators){
        this.locators=locators;
    }
    public String getLocators(){
        return this.locators;
    }

}
