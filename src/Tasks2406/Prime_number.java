package Tasks2406;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        // Taking the input from the user
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime=true;
        for(int i=2;i<number;i++){
            if(i%2==0){
                isPrime=false;
            }
        }
        System.out.println(isPrime);
    }
}