package ex_24_OOPS_accessModifier.Police;

public class Lab192 {
}
class Father{
    private int gold=10;
    int car=1;
    int bhk3=1;
}
class Son extends Father{
    void canweuse(){
       // System.out.println(gold);-->cant access private
        System.out.println(car);
        System.out.println(bhk3);
    }
}