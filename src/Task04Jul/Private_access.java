package Task04Jul;

public class Private_access {
    String name="sindhu";
    private int gold=1000;
    // private gold can be accessed using a getter/setter public method
    public int getGold() {
        return gold;
    }

}
class Child4 extends Private_access{
    public static void main(String[] args) {
        Private_access pa=new Private_access();
        System.out.println(pa.getGold()); //private gold printed
    }
}
