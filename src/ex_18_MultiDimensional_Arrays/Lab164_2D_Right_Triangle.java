package ex_18_MultiDimensional_Arrays;

import java.util.Scanner;

public class Lab164_2D_Right_Triangle {
    public static void main(String[] args) {
        // How the pattern we want
        //  n = 3
        // *                    00  01  02
        // **                   10  11  12
        // ***                  20  21  22
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n....");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
