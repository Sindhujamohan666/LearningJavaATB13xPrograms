package Tasks11Jul;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class FindEle_ArrayList {
    /* Find an Element in ArrayList
     📘 Description:
     Create an ArrayList of cities: Mumbai, Delhi, Pune.
     Check if Pune is present in the list. Print a message accordingly.
     (you can use If Condition to check the Pune city and you can take the City name from User)
     ✅ Expected Output:
     Pune is in the list. */
    public static void main(String[] args) {
        List city=new ArrayList();
        city.add("Mumbai");
        city.add("Delhi");
        city.add("Pune");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a city name");
        String city_input=sc.next();
        if(city_input.contains("Pune")){
            System.out.println("Pune is in the list");
        }else{
            System.out.println("Pune is not in the list");
        }
    }
}
