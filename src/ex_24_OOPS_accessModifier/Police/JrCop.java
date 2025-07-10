package ex_24_OOPS_accessModifier.Police;

public class JrCop {
    public static void main(String[] args) {
        //Junior cop is creating an object for cop class to  call shoot function and shoot
        Cop c=new Cop(10);
        c.canIshoot();
        c.thisDefaultF1();
    }

}
