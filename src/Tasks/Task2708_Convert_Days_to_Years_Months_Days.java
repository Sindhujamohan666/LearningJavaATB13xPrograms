package Tasks;
import java.util.Scanner;
public class Task2708_Convert_Days_to_Years_Months_Days {
    public static void main(String[] args) {
        //if you input 1000 days, the output of the program would be:
        // 2 years, 9 months, and 0 days.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days");
        int input=sc.nextInt();
        int years=input/365;
        int remaining_days=input%365;
        int months=remaining_days/30;
        int days_count=remaining_days%30;
        System.out.println(years +" years," + months +" months," +days_count +" days");

    }

}
