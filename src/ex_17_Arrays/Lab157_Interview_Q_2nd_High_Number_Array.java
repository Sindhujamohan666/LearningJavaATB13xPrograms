package ex_17_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);//2nd largest number
        System.out.println(numbers[numbers.length-2]);//3rd largest number
    }
}
