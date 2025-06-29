package Tasks;

import java.util.Scanner;

public class Task2706_Websitetype {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any website");
        String website=s.next();
        //Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
        if(website.contains(".com")){
            System.out.println("The website type is: Commercial website");
        }
        else if(website.contains(".org")){
            System.out.println("The website type is: Non-profit organization");
        }
        else if(website.contains(".edu")){
            System.out.println("The website type is: Educational institution");
        }
        else if(website.contains(".gov")){
            System.out.println("The website type is: Government website");
        }
        else if (website.contains(".net")){
            System.out.println("The website type is: Network-related website");
        }
        else if(website.contains(".info")){
            System.out.println("The website type is: Informational website");
        }
        else{
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
