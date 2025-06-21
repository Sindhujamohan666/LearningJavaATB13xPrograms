package ex_11_For_loop;

public class Lab102_For_No_Condition {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println(i);
        }
         //without condition this is an infinite loop
        // exit code 130 (Stop by Yourself- Kill ) Red Button - interrupted by signal
        // exit code 0 - Successful
    }


}
