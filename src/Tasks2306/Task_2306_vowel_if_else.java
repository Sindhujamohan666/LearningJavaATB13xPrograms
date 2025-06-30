package Tasks2306;
import java.util.Scanner;
public class Task_2306_vowel_if_else {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any character.....");
        char ch=scanner.next().toLowerCase().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+ " is a vowel");
        }
        else
        {
            System.out.println(ch+ " is not a vowel");
        }
    }
}
