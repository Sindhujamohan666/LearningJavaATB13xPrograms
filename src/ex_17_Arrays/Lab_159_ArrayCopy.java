package ex_17_Arrays;
public class Lab_159_ArrayCopy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];
        System.arraycopy(original,0,copy,0,original.length);
        System.out.println(copy);//prints reference
        for(int i=0;i<copy.length;i++){
            System.out.println(copy[i]);
        }

    }

}
