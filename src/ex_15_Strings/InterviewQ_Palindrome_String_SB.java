package ex_15_Strings;

import java.util.Scanner;
public class InterviewQ_Palindrome_String_SB {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any string...");
        String word=s.next();
        String reversedstring=string_rev(word);
        if(reversedstring.equalsIgnoreCase(word)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
    public static String string_rev(String userInput){
        String reversed="";
        for(int i=userInput.length()-1;i>=0;i--){
         reversed+=userInput.charAt(i);
        }
      return reversed;
    }
    public static String SBrev(String userInput){
        StringBuilder sb=new StringBuilder(userInput);
        return sb.reverse().toString();

    }
}
