package Task08Jul;

public class String_Wrapper {
    /* Task 2: Converting String to Primitive Using Wrapper

📘 Description:
Use Integer.parseInt() to convert a string (e.g. "123") into a primitive int and print it.

📤 Expected Output:

Parsed number: 123 */
    public static void main(String[] args) {
        String intvalue="123"; //String is a wrapper
        int stringtoint=Integer.parseInt(intvalue); //converts String to int
        System.out.println(stringtoint);
    }
}
