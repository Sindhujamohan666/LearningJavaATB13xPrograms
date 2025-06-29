package Tasks2406;

import java.util.Scanner;

public class Smallest_Three_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1=sc.nextInt();
        System.out.println("Enter the number 2");
        int num2=sc.nextInt();
        System.out.println("Enter the number 3");
        int num3=sc.nextInt();
        if(num1>=num2&&num1>=num3) {
            System.out.println(num1 + " is greater");
        }
        if(num2>=num1&&num2>=num3){
            System.out.println(num2 + " is greater");
        }
        else if(num3>=num1&&num3>=num2){
            System.out.println(num3 + " is greater");
        }

    }
}
