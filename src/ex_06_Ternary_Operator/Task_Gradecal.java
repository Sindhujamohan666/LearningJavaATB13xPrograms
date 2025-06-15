package ex_06_Ternary_Operator;

public class Task_Gradecal {
    public static void main(String[] args) {
        int marks=69;
        // Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
        String Grade=(marks>=90)?"A+":(marks>=75)?"A":(marks>=60)?"B":(marks>=40)?"C":"Fail";
        System.out.println(Grade);

    }
}
