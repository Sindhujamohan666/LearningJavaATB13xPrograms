package ex_34_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> vehicles=new HashMap();
        vehicles.put("MG Astor",1);
        vehicles.put("i10",2);
        vehicles.put("Honda ACTIVA",1);
        vehicles.put("BMW",2);
        vehicles.put("TESLA",5);
        vehicles.put("TESLA",10);
    //        vehicles.put(234,"dasda");
        System.out.println("Total Vehicles :" +vehicles.size());

        //Iterator for Map
        for(String Key :vehicles.keySet()){ //deletes the keys
            System.out.println(Key +"->"+vehicles.get(Key));

        }
        //// Checking if key exists
        if(vehicles.containsKey("Audi")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        // Clearing the Map
        vehicles.clear();
        System.out.println("After the operation size is "+vehicles.size());
    }
}
