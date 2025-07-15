package ex_34_Collection_Framework_DSA.LIST;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Lab250_AL_Interview {
    public static void main(String[] args) {
        List marks=new ArrayList();
        marks.add(91);
        marks.add(97);
        marks.add(95);
        marks.add(99);
        System.out.println(marks);
        //sorting
        Collections.sort(marks);
        System.out.println(marks);
        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, qu may required)
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
