package ex_34_Collection_Framework_DSA.LIST;
import java.util.List;
import java.util.ArrayList;
public class Lab249_NestedArrayList {
    public static void main(String[] args) {
        List<String> fruits1=new ArrayList();
        fruits1.add("Orange");
        fruits1.add("Apple");
        fruits1.add("Cherry");
        System.out.println(fruits1);

        List fruits2=new ArrayList();
        fruits2.add("Mango");
        fruits2.add("Grapes");
        fruits2.add("Papaya");
        System.out.println(fruits2);

        List vegetables=new ArrayList();
        vegetables.add("tomato");
        vegetables.add("Potato");
        vegetables.add("Onion");
        System.out.println(vegetables);

        List allfruits=new ArrayList();
        allfruits.add(fruits1);
        allfruits.add(fruits2);
        allfruits.add(vegetables);
        System.out.println(allfruits);
        System.out.println(allfruits.get(2));
    }
}
