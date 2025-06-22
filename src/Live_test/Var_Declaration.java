package Live_test;

import java.util.Scanner;

public class Var_Declaration {
    public static void main(String[] args) {
        //Integer: 25 Double: 3.14 Boolean: true Character: A
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an integer");
        int a=s.nextInt();
        System.out.println("Enter a double value");
        double d=s.nextDouble();
        System.out.println("Enter a boolean value");
        boolean bool=s.nextBoolean();
        System.out.println("Enter a Char value");
        char ch=s.next().charAt(0);
        System.out.println("Integer:" +a);
        System.out.println("Double:" +d);
        System.out.println("Boolean:" +bool);
        System.out.println("Charadter:" +ch);
    }
}
