package ex_10_Switch;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=scanner.next().toLowerCase().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("It is vowel");

        }
        else{
            System.out.println("It is consonent");
        }



    }


}
