package Tasks2306;
import java.util.Scanner;
public class Task_2306_vowel_switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any character.....");
        char ch=scanner.next().toLowerCase().charAt(0);
        switch(ch){
            case 'a','e','i','o','u'->System.out.println(ch+ " is vowel");
            default->System.out.println(ch+ " is not a vowel");
        }

    }
}
