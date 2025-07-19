package Task08Jul;

public class WrapperObject_Equals {
    /*Task 5: Compare Wrapper objects using == and equals()
📘 Description:
Compare two Integer objects using == and .equals() and print the results.
Expected Output:
a == b: true
c == d: false
a.equals(b): true
c.equals(d): true  */
    public static void main(String[] args) {
        Integer a=100;
        Integer b=100;
        Integer c=200;
        Integer d=200;
        System.out.println(a==b); // true - cached values (-128 to 127)
        System.out.println(c==d); // false - outside cache range
        System.out.println(a.equals(b)); // true - value comparison
        System.out.println(c.equals(d)); // true - value comparison
    }
}
