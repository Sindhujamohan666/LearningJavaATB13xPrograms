package ex_10_Switch;

public class Lab092_Interview_Duplicate_Case {
    public static void main(String[] args) {
        int a = 98;
        switch (a) {
            case 98:
                System.out.println("98");
//            case 98:  --Two case with same/duplicate labels is not possible
//                System.out.println("98");
        }
    }
}
