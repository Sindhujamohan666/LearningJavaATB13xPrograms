package Live_test;

public class Largest_of3 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int c=8;
        if((a>b)&&(a>c)){
            System.out.println(a+ " is greater ");
        }
        else if((b>a)&&(b>c)){
            System.out.println(b+ " is greater ");
        }
        else if((c>a)&&(c>b)) {
            System.out.println(c + " is greater");
        }
    }
}
