package Live_test;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=10;j++){
                int mul=i*j;
                System.out.printf("%d * %d =%d",i,j,mul).println();

            }
        }

    }
}
