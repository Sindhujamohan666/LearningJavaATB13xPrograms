package Live_test;

public class Increment {
    public static void main(String[] args) {
        int i=5;
        //output
        int preinrement=++i;
        System.out.println("pre-inrement "+preinrement);
        int postincrement=i++;
        System.out.println("post-inrement "+postincrement);
        int predecrement=--i;
        System.out.println("pre-decrement "+predecrement);
        System.out.println("post-decrement "+(i--));


        //7/exp 6/ a=6
        //8/ exp 6  /7
        //8/ exp 6/6
        //9/exp 5  /6


    }
}
