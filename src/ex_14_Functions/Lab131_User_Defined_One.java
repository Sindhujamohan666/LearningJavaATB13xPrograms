package ex_14_Functions;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {
        int result = sum_of_number(3, 4);//func with return type can be assigned to var

        sum_of_number_no_return(3,5);//func w/o return type cannot


        // be assigned to var

        System.out.println(result);
    }

    static int sum_of_number(int a, int b) {
        return a + b;
    }

    static void sum_of_number_no_return(int a, int b) {
        System.out.println(a+b);
    }
    }

