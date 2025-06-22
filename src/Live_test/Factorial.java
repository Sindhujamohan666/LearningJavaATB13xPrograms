package Live_test;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defind for negativ numbers");

        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }
}
