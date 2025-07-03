package Task03Jul.Overloading;

public class Print_Data_Overloading {
    public static void main(String[] args) {
        //Here functions are called according to the parameters passed
        Printer p1=new Printer();
        System.out.println(p1.printData(5));
        System.out.println(p1.printData("str"));
        System.out.println(p1.printData(3.4f));//float number should end with f/F

    }

}
class Printer{
    String printData(String data){
       return data;
    }
    int printData(int data){
        return data;
    }
    float printData(float data){
        return data;
    }
}