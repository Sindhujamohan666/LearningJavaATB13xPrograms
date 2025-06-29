package ex_15_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name="sindhu"; //stord in string constant pool
        name.toUpperCase(); //this will not be changed as strings are immutable
        System.out.println(name); //sindhu
        String name1="Sindhuja";
        name1=name1.toUpperCase(); //will be converted as string is re-assigned
        System.out.println(name1);

    }
    }

