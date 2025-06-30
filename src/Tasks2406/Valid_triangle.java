package Tasks2406;

import java.util.Scanner;

public class Valid_triangle {
    public static void main(String[] args) {
        //Check if a Triangle is Valid Based on Three Sides.
        //sum of length of any 2 side>third side=valid triangle
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side1 length");
        int side1=sc.nextInt();
        System.out.println("Enter the side2 length");
        int side2=sc.nextInt();
        System.out.println("Enter the side3 length");
        int side3=sc.nextInt();
        int sum12= side1+side2;
        int sum23=side2+side3;
        int sum31=side3+side1;
        if((sum12>side3)&&(sum23>side1)&&(sum31>side2)){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Invalid triangle");
        }

    }
}
