package Tasks11Jul;
import java.util.List;
import java.util.LinkedList;
public class Reverse_Linkedlist {
    /*Reverse a LinkedList
    📘 Description:
    Create a LinkedList and add the following numbers:
    10, 20, 30, 40.
    Reverse the list and print the output.
   ✅ Expected Output:
   Reversed List:
   [40, 30, 20, 10]
     */
    public static void main(String[] args) {
        List l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println("Reversed List: "+l.reversed());
    }
}
