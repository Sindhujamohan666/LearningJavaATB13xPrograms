package Live_test;

public class Increment {
    public static void main(String[] args) {
        int a=5;
        //output
        System.out.println("Pre-increment:"+(++a));
        System.out.println("Post-increment:"+(a++));
        System.out.println("Post-decrement:"+(a--));
        System.out.println("Pre-decrement:"+(--a));

        //6/exp 6/ a=6
        //7/ exp 6  /7
        //8/ exp 7/6
        //9/exp 5  /5


    }
}
