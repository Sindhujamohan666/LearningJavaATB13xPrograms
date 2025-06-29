package Tasks2406;

import java.util.Scanner;

public class Check_Char_Alpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character....");
        char ch=sc.next().charAt(0);//for char at charAt index is necessary
        if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println(ch +" is character");
        }
        else{
            System.out.println(ch+ " is not character");
        }
    }
}
