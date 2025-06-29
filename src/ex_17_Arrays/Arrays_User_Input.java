package ex_17_Arrays;

import java.util.Scanner;

public class Arrays_User_Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array (int only");
        int size = s.nextInt();
        //        float[] numbers_marks =  new float[size];
        // String[] numbers_marks =  new String[size];
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = s.nextInt();
        }
        System.out.println(" ---- Below Code is printing the elements! ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}

