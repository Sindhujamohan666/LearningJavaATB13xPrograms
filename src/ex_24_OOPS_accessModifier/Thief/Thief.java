package ex_24_OOPS_accessModifier.Thief;

import ex_24_OOPS_accessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief=new Cop(10);
        //thief.gun=100;-->thief cannot access private variable
        // thief.canIShoot();
        // thief.thisDefaultF1();
    }
}
