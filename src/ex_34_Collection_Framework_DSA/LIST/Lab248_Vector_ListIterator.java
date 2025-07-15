package ex_34_Collection_Framework_DSA.LIST;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class Lab248_Vector_ListIterator {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");
         /*ListIterator --->Only for list but same as iterator but has hasprevious method also .
        We always use iterator as it is common to list,set and queue */
        ListIterator listIterator  = vector.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


        System.out.println(" --- ");

        Iterator iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
