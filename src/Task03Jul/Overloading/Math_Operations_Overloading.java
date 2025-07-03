package Task03Jul.Overloading;

public class Math_Operations_Overloading {
    public static void main(String[] args) {
        Math_Operations mo=new Math_Operations();
        System.out.println(mo.mul(3,6));
        System.out.println(mo.mul(1,2,3));
    }
}
// For overloading it is not necessary  to extend
class Math_Operations{
    int mul(int a,int b){
        return a*b;
    }
    int mul(int a,int b,int c){
        return a*b*c;
    }
}
