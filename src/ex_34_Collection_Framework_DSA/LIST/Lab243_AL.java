package ex_34_Collection_Framework_DSA.LIST;
import java.util.List;
import java.util.ArrayList;
public class Lab243_AL {
    public static void main(String[] args) {
        //List list=new ArrayList();
        //Default AL capacity is 10 .When reached n-1 elements ,it expands twice its size.
        List list=new ArrayList(10);
        list.add("1"); //0
        list.add("2"); //1
        list.add("3"); //2
        list.add("3"); //3
        list.add("4"); //4
        list.add(true); //5
        list.add("3"); //6
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));

    }


}
