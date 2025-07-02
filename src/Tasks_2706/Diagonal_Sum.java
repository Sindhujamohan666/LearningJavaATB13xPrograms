package Tasks_2706;

public class Diagonal_Sum {
    public static void main(String[] args) {
        /*Write a Java Program to Calculate Matrix Diagonal Sum
          *              00 01 02
          ***            10 11 12
          ***** */    // 20 21 22
        //Diagonal row=col
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int length= matrix.length;
        int diagsum=0;
        for(int i=0;i<length;i++){
            diagsum+=matrix[i][i];
        }
        System.out.println("Diagonal sum is " +diagsum);

    }
}
