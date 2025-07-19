package Task09Jul;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class CheckedException_FileReader {
   /* Task 7: Handle Checked Exception using Try-Catch

📘 Description:
    Open a file using FileReader and handle FileNotFoundException using try-catch.*/
   public static void main(String[] args) {
       try{
           FileReader fs=new FileReader("C:\\Users\\WELCOME\\Documents\\okok");
       }catch(FileNotFoundException e){
           System.out.println(e.getMessage());

       }

   }
}
