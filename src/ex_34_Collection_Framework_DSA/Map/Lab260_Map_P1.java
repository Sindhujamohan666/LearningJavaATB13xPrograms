package ex_34_Collection_Framework_DSA.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Lab260_Map_P1 {
    public static void main(String[] args) {
        //Map m1=new Map();-->This cant be done as Map is an interface
        Map m1=new HashMap(10);
        // Map is key and value pair
        // name -> pramod
        //no order
        m1.put("name","sindhu");
        m1.put("rollno",1);
        m1.put("phone",987654321);
        //m1.put(34,90);
        System.out.println(m1);

        //prints in given order
        Map m2=new LinkedHashMap();
        m2.put("name","sindhu");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);

        //TreeMap-->Natural sort
        Map m3=new TreeMap();
        m3.put("name","sindhu");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);
    }
}
