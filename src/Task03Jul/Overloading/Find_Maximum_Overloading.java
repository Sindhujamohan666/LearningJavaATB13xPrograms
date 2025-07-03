package Task03Jul.Overloading;

public class Find_Maximum_Overloading {
    public static void main(String[] args) {
        Find_Maximum fm=new Find_Maximum();
        System.out.println(fm.max(2,3));
        System.out.println(fm.max(1,2,3));
        System.out.println(fm.max(2.5f,3.0f));
    }
}

class Find_Maximum{
    int max(int a, int b){
        if(a>=b){
            return a;
        }else{
            return b;
        }
    }
    int max(int a ,int b,int c){
        if(a>=b && a>=c){
            return a;
        }else if (b>=a && b>=c){
            return b;
        }else{
            return c;
        }
    }
    double max(double a, double b){
        if(a>=b){
            return a;
        }else{
            return b;
        }
    }

}
