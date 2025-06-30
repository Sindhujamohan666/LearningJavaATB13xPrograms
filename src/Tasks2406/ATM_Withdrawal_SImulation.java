package Tasks2406;

import java.util.Scanner;

public class ATM_Withdrawal_SImulation {
    public static void main(String[] args) {
        /* 1. Initialize the account balance with a fixed amount (e.g., ₹10,000).
           2. Take user input for the amount they want to withdraw.
           3.Check withdrawal conditions:
             The amount should be greater than zero.
             The amount should be a multiple of 100 (common ATM rule).
             The amount should not exceed the account balance.
           4. Deduct the amount from the balance if conditions are met.
           5.Display the updated balance or an error message if the withdrawal fails.

         */
        int account_balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw.");
        int withdrawal_amount = sc.nextInt();
        if (withdrawal_amount < 0) {
            System.out.println("The amount should be greater than zero");
        } else if (withdrawal_amount % 100 != 0) {
            System.out.println("The amount should be a multiple of 100");
        } else if (withdrawal_amount > account_balance) {
            System.out.println("The amount should not exceed the account balance.");
        }
        if (withdrawal_amount >= 0 && withdrawal_amount % 100 == 0 && withdrawal_amount <= account_balance) {
            account_balance = account_balance - withdrawal_amount;
            System.out.printf("The amount %d is deducted from your account and the remaining balance is %d", withdrawal_amount, account_balance);
        }
    }
}
