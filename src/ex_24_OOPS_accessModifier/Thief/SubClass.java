package ex_24_OOPS_accessModifier.Thief;

import ex_24_OOPS_accessModifier.Police.Cop; //Cop class is in diff package so importing it

public class SubClass extends Cop {
    public SubClass(int bullet){
        super(bullet);//calls parent class constructor-parameterized
    }
    public static void main(String[] args) {
//        new SubClass().thisisDefaultF1();
//        new SubClass().canIShoot();
    }
}
