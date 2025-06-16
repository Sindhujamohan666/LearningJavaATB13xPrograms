package ex_10_Switch;

public class Lab094_JDK13_Multicase {
    public static void main(String[] args) {
        int itemCode = 002;
        switch(itemCode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                System.out.println("All of the them are Electronic Gadget");
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                break;
            default:
                System.out.println("None");

        }
    }
}
