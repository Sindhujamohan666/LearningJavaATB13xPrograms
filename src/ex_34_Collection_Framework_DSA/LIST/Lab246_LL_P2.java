package ex_34_Collection_Framework_DSA.LIST;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
public class Lab246_LL_P2 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // // Arrays Format - Continuous

        List mylist2 = new LinkedList(); // Doubly Linked List.
        mylist2.add("Pramod");
        mylist2.add("Dutta");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Dutta"));
        System.out.println(mylist2.indexOf("Dutta"));
        System.out.println(mylist2.get(0));

        System.out.println("----------");
        Iterator iterator= mylist2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
