package Tasks2406;

import java.util.Scanner;

public class Grade_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any mark...");
        int mark = sc.nextInt();
        if (mark < 0 || mark > 100) {
            System.out.println("Invalid mark");
        } else if (mark >= 90) {
            System.out.println("A+");
        } else if (mark >= 80) {
            System.out.println("A");
        } else if (mark >= 70) {
            System.out.println("B");
        } else if (mark >= 60){
            System.out.println("C");
        } else if (mark >= 50 ){
            System.out.println("D");
        }else if (mark >= 40 ){
            System.out.println("E");
        }else if(mark<40){
            System.out.println("Fail");
        }

    }
}
