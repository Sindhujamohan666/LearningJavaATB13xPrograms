package ex_24_OOPS_accessModifier.Police;

public class Cop {
    private int gun; //making it private so only cop class can use it
    private String idcard;
    public Cop(int bullet){
        this.gun=bullet;
    }
    //Method and behaviour
    protected void canIshoot(){
        System.out.println("Yes you can!..");
    }
    void thisDefaultF1(){
        System.out.println("Hi!Cop..");
    }
}
