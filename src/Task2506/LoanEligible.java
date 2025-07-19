package Task2506;
import java.util.Scanner;
public class LoanEligible {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the age..");
      int age=sc.nextInt();
      System.out.println("Enter the salary..");
      double salary=sc.nextDouble();
      System.out.println("Enter the credit score");
      int cs=sc.nextInt();
      if((age>0&&age>=18&&age<=80)&&(salary>0&&salary>=30000)&&(cs>0&&cs>=650&&cs<=850)){
          System.out.println("Eligible for loan");
      }else{
          System.out.println("NOt eligible for loan");
      }


    }
}
