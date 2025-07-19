package Task09Jul;

public class Catch_Specific_Generic {
    /* ✅ Task 6: Catch Specific vs Generic Exception

📘 Description:
Try the same code twice — once using catch(Exception e) and once using catch(NullPointerException e).
Compare output and behavior. */ //(both are giving same message)-observation
    public static void main(String[] args) {
        //Block one using catch(Exception e)
        try{
            String b=null;
            System.out.println(b.length());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        //Block 2 catch(NullPointerException e).
        try{
            String b=null;
            System.out.println(b.length());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
