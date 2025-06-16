package ex_10_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {
        //switch can be written in a single line with JDK versions above 13
        // in JDK > 13
        //  No need of break keyword
        // one line supported.
        int itemCode = 002;
        switch(itemCode){
            case 001-> System.out.println("001");
            case 002-> System.out.println("002");
            case 003-> System.out.println("003");
            default -> System.out.println("Default");

        }
    }
}
