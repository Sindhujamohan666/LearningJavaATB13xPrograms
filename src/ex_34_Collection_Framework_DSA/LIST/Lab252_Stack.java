package ex_34_Collection_Framework_DSA.LIST;
import java.util.Stack;
public class Lab252_Stack {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.add("python");
        stack.add("C#");
        stack.add("Java");

        System.out.println(stack);
        System.out.println(stack.peek()); //peek shows topmost element
        System.out.println(stack.pop());//removes topmost element
        System.out.println(stack);
        // Create Integer type stack
        Stack<Integer> s1=new Stack<>();
        // Create String type stack
        Stack<String> s2=new Stack<>();
        s1.push(23);
        s1.push(30);
        s1.push(35);
        System.out.println(s1);


    }
}
