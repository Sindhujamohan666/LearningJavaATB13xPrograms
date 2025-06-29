package ex_17_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max_value=max_num(array);
        int min_value=min_num(array);
        System.out.println(max_value);
        System.out.println(min_value);

    }
    public static int max_num(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int min_num(int[] array){
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }


    }

