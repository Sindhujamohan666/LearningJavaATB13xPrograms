package ex_10_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    // Web Automation
    // I will ask the user to give me the input from browser which he wants to
    // use to I will start the automation in that browser.

//        String browser = args[0];
//        System.out.println(browser);
       public static void main(String[] args) {
           Scanner scanner=new Scanner(System.in);
           System.out.println("Enter the  browser,which you want to start");
           String browser=scanner.next();
           browser=browser.toLowerCase();
           switch(browser){
               case "chrome":
                   System.out.println("Starting the chrome");
                   System.out.println("........");
                   System.out.println("TC1");
                   System.out.println("TC2");
                   break;
               case "firefox":
                   System.out.println("Starting the firefox browser");
                   // Further code to start the Firefox
                   // Webdriver driver = new Firfox(); // Selenium Code
           }

        }




}
