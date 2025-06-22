package Live_test;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=s.nextInt();
        System.out.println("Enter num2");
        int num2=s.nextInt();
        //double add=addition(num1:15.5,num2:14.5);
        }
        public static double addition(int num1,int num2) {
        return num1+num2;

        }
        public static int subtraction(int num1,int num2) {
        return num1-num2;

        }
        public static int multipliplication(int num1,int num2) {
        return num1*num2;

       }
       public static int division(int num1,int num2) {
        return num1/num2;

       }
      public static int modulus(int num1,int num2) {
        return num1%num2;

       }


}
