package Tasks_2706;
import java.util.Scanner;
public class Task2706_SeniorCitizen_AgeClassif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any age...");
        int age=sc.nextInt();
        if(age<0){
            System.out.println("Invalid age");
        }else if(age<=12){
            System.out.println("Child");
        }else if(age<=19){
            System.out.println("Teenager");
        }else if(age<=64){
            System.out.println("Adult");
        }else if(age>65){
            System.out.println("Senior Citizen");
        }
    }
}
