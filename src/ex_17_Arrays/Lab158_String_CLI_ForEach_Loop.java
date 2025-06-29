package ex_17_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] sindhu) {
        for (int i = 0; i < sindhu.length; i++) {
            System.out.println(sindhu[i]);
        }
        System.out.println("-----");
        for(String var:sindhu){
            System.out.println(var);
        }
    }
}