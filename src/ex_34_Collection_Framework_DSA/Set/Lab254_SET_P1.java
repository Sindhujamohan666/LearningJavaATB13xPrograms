package ex_34_Collection_Framework_DSA.Set;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class Lab254_SET_P1 {
    public static void main(String[] args) {
        //Set is similar to ArrayList but duplicates are not allowed .
        /* HashSet provides no ordering, LinkedHashSet maintains insertion order,
        and TreeSet keeps elements sorted based on their natural ordering or a provided comparator.
         */
        Set hs=new HashSet();
        Set lhs=new LinkedHashSet();
        Set ts=new TreeSet();

        hs.add("Sindhuja");
        hs.add("Sindhuja"); //duplicates are ignored .
        hs.add("Mohanasundaram");
        System.out.println(hs);
    }
}
