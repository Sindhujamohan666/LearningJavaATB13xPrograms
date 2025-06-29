package ex_17_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {
        int[] marks={90,91,92,93,94,95};
        System.out.println("-----------");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("-----------");
        Arrays.sort(marks); //sorts in ascending order
        for(int i=0;i<marks.length;i++){
           System.out.println(marks[i]);
        }

        }
    }

