package ex_34_Collection_Framework_DSA.LIST;
import java.util.ArrayList;
import java.util.List;

public class Lab242_ArrayList {
    public static void main(String[] args) {
        ArrayList arraylist=new ArrayList();
        arraylist.add("pramod");
        arraylist.add("null");
        arraylist.add("dutta");
        arraylist.add("dutta");// Duplicate is allowed.
        arraylist.add(123); //Different datatype is allowed.
        System.out.println(arraylist);
        System.out.println(arraylist.size());

        List l=new ArrayList();
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
