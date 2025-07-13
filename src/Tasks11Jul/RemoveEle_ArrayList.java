package Tasks11Jul;
import java.util.List;
import java.util.ArrayList;
public class RemoveEle_ArrayList {
    /* Remove an Element from ArrayList📘  Description:
    Create an ArrayList with these names: Amit, Neha, Suresh.
    Remove the name Neha and display the updated list.
    ✅ Expected Output:
    Names after removal:
    [Amit, Suresh]
     */
    public static void main(String[] args) {
        List names=new ArrayList();
        names.add("Amit");
        names.add("Neha");
        names.add("Suresh");
        names.remove("Neha");
        System.out.println("Names after removal"+names);
    }
}
