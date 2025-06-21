package ex_11_For_loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
            if (i == 5) {
                break; //code breaks when i is 5
            } else {
                System.out.println(i);
            }
        }
    }
}
