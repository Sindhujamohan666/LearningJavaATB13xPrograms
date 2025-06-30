package Tasks2306;
import java.util.Scanner;
public class Task_2306_Largest_ofThree {
    public static void main(String[] args) {
        //Including equals case as well using >=
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number1...");
        int num1 = s.nextInt();
        System.out.println("Enter the number2...");
        int num2 = s.nextInt();
        System.out.println("Enter the number3...");
        int num3 = s.nextInt();
        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println(num1 + "is greater");
        } else if ((num2 >= num1) && (num2 >= num3)) {
            System.out.println(num2 + "is greater");
        } else if ((num3 >= num1) && (num3 >= num2)) {
            System.out.println(num3 + "is greater");
        }
    }

}

