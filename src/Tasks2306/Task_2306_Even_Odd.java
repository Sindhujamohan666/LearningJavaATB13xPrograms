package Tasks2306;

import java.util.Scanner;

public class Task_2306_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number.....");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println(num+ " is even");
        }
        else{
            System.out.println(num+ " is odd");
        }
    }
}
