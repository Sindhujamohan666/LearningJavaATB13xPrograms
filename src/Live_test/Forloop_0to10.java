package Live_test;

import java.util.Scanner;

public class Forloop_0to10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
