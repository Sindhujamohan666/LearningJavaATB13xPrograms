package ex_18_MultiDimensional_Arrays;
import java.util.Scanner;
public class Lab166_2d_Multiplication_Table {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size......");
        int size=s.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                System.out.printf("%d*%d=%d",i,j,i*j);
                System.out.println("");
            }
        }

    }


}
