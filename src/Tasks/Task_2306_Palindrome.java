package Tasks;


import java.util.Scanner;
public class Task_2306_Palindrome {
    public static void main(String[] args) {
        /*Create a program that checks whether a given string is a palindrome.
        A palindrome is a word or phrase that reads the same backward as forward
        (ignoring spaces, punctuation, and capitalization). Use an if-else statement
        to determine if the string is a palindrome*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any word");
        String word=scanner.next();
        String reversed="";
        for(int i=word.length()-1;i>=0;i--) {
            reversed += word.charAt(i);
        }
        if(word.equals(reversed)){
            System.out.println(word + " is a palindrome");
        }
        else{
            System.out.println(word + " is not a palindrome");
        }

    }
}
