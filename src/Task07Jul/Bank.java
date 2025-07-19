package Task07Jul;

abstract class Bank {
    /*Description: Abstract class Bank with abstract method getInterestRate().
     Classes SBI and HDFC implement it.
🔶 Expected Output:
SBI Interest Rate: 6.5%
HDFC Interest Rate: 7.0%  */
    public static void main(String[] args) {
        SBI s=new SBI();
        s.getInterestRate();
        HDFC h=new HDFC();
        h.getInterestRate();
    }
   abstract void getInterestRate();

}
class SBI extends Bank{
    void getInterestRate(){ //abstract method implementation
        System.out.println("SBI Interest Rate: 6.5% ");
    }
}
class HDFC extends Bank{
    void getInterestRate(){ //abstract method implementation
        System.out.println("HDFC Interest Rate: 7.0% ");
    }
}