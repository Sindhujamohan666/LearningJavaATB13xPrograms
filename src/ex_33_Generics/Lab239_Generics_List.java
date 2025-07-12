package ex_33_Generics;
import java.util.List;
import java.util.ArrayList;
public class Lab239_Generics_List {
        public static void main(String[] args) {
            List normalList = new ArrayList(); //accepts all datatype
            normalList.add(10);
            normalList.add("Pramod");
            normalList.add(true);

            List<Integer> integerList = new ArrayList();
            integerList.add(10);
            // integerList.add("Pramod");

    }
}
