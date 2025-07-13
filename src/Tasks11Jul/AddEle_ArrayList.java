package Tasks11Jul;
import java.util.List;
import java.util.ArrayList;

public class AddEle_ArrayList {
    /*1. Add and Display Elements in ArrayList
    📘 Description:
    Create an ArrayList of student names. Add the following 5 students:
    Dipak, Ravi, Sneha, Priya, Anjali.
    Then display all names using a loop.
    ✅ Expected Output:
    Student List:
    Dipak,Ravi,Sneha,Priya,Anjali
     */
    public static void main(String[] args) {
        List stud=new ArrayList();
        stud.add("Dipak");
        stud.add("Ravi");
        stud.add("Sneha");
        stud.add("Priya");
        stud.add("Anjali");
        System.out.println("Student List "+stud);
    }

}
