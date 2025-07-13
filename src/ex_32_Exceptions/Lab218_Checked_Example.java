package ex_32_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab218_Checked_Example {
    public static void main(String[] args) throws FileNotFoundException {
        //Checked Exception-here file may/may not be present so it asks to add throws automatically    //Checked Exception-here file may/may not be present so it asks to add throws automatically
        FileInputStream fs=new FileInputStream("C://a.txt");
    }
}
