package ex_34_Collection_Framework_DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class Lab259_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList();
        queue.add(6);
        queue.add(1);
        queue.add(8);

        Iterator iterator=queue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
