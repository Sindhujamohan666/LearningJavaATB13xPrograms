package Tasks11Jul;
import java.util.List;
import java.util.LinkedList;
public class LinkedList_Insert {
    /* Insert in Middle of LinkedList
   📘 Description:
   Create a LinkedList with fruits: Apple, Banana, Mango.
   Insert Orange at index 1 and print the final list.
   ✅ Expected Output:
   Fruits List: [Apple, Orange, Banana, Mango]  */
    public static void main(String[] args) {
        List fruits=new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add(1,"Orange");
        System.out.println("Fruits List" +fruits);

    }
}
