package Tasks;
import java.util.Scanner;
public class Task_2306_vote_Eligibility {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any age.....");
        int age=scanner.nextInt();
        if(age>18){
            System.out.println("Person is eligible to vote");
        }
        else{
            System.out.println("Person is not eligible to vote");
        }
    }
}
