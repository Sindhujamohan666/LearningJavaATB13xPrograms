package Live_test;

public class Logical_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean b1 = !(a>b);
        boolean b2=(a > b) && (a > 0);
        boolean b3=(a < b) || (a > 0);
        /*a == b: false a > b: true a < b: false (a > b) && (a > 0): true
        (a < b) || (a > 0): true !(a > b): false
         */
        System.out.println("a==b :" +(a==b));
        System.out.println("a>b :" +(a>b));
        System.out.println("a>b :" +(a<b));
        System.out.println("And operator :" +b2);
        System.out.println("OR operator :" +b3);
        System.out.println("Not Operator :" +b1);
    }
}
