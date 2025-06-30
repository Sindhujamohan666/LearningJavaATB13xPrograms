package Task2406;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        // Taking the input from the user
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime=true;
        /*skips doing i%2 for the initial i value(skips 2) if (i=3;i<number;i++)-skips
        i%2 for 3*/
        for(int i=2;i<number;i++){
            if(i%2==0){
                isPrime=false;
            }
        }
        System.out.println(isPrime);
    }
}