package ex_11_For_loop;

public class Lab107_ForLoop_2 {
    public static void main(String[] args) {
        //for loop can be used for float and long as well but generally advisable for int only.
        for (long i = 1l; i < 10; i++) {
            System.out.println(i);
        }
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
        }
    }
}
