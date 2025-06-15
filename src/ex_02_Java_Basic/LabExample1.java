package ex_02_Java_Basic;

public class LabExample1 {
        //
//    int i;
//    static int s;
//

        public static void main (String[]args){
            int a = 10;
            {
                //b scope is only within loop
                int b = 10;
                System.out.println(b);
            }
            int b = 90;
            System.out.println(b);
        }
    }

