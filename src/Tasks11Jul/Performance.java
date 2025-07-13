package Tasks11Jul;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
public class Performance {
    /*📘 Description (Updated with Hints):
In this program, you’ll compare how fast Java can add elements to an ArrayList versus a LinkedList.
You will:
Create two separate lists: one ArrayList and one LinkedList.
Add 100,000 numbers (from 0 to 99,999) to each list using a loop.
Use System.currentTimeMillis() to measure how much time it takes to add the elements.
Print the time taken for both lists.
Hint :-
:-  System.currentTimeMillis() gives you the current time in milliseconds.
:-  Subtract the end time from the start time to get the duration.
:-  You don’t need to print all the 100,000 numbers, just print the time taken.
✅ Expected Output:
ArrayList time: 8 ms
LinkedList time: 12 ms */
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        List list=new ArrayList();
        for(int i=0;i<=99999;i++){
            list.add(i);
        }
        long stoptime=System.currentTimeMillis();
        System.out.println("ArrayList time"+ (stoptime-starttime));

        long loop_starttime=System.currentTimeMillis();
        List linkedlist=new LinkedList();
        for(int i=0;i<=99999;i++){
            linkedlist.add(i);
        }
        long loop_stoptime=System.currentTimeMillis();
        System.out.println("Linkedlist time"+ (loop_stoptime-loop_starttime));
    }


}
