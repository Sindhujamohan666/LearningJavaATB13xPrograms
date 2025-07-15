package ex_34_Collection_Framework_DSA.LIST;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class Lab247_Vector {
    public static void main(String[] args) {
        /*Vector methods are **synchronized**, so vector objects can’t be accessed by
        multiple threads at a time.(Slow). */
        Vector v=new Vector();
        Vector v1=new Vector(10);
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);
        //for loop
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
        //for each loop
        for(Object o : v){
            System.out.println(o);
        }
        //Iterator
        Iterator iterator=v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Enumeration -not used commonly
        System.out.println("Enumeration----------");
        Enumeration<Object> enumeration=v.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
