package ex_20_OOPS_Constructor;

public class Lab173_OOPs_Constructor {
    //When an object is created ,constructor is called
    public static void main(String[] args) {
        Baby b1 = new Baby();
    }
}


class Baby{
    // Attribute | Instance Variable |  Member variables, data members
    String name;

    // Default Constructor!
    Baby(){
        System.out.println("I am called,default constructor");
        System.out.println("Your aadhar number is ready");
        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)
    }
        void m1() {
            System.out.println("I am m1");
        }
        //behaviour
        void cry(){
                System.out.println("Cry!!");
        }
        void sleep() {
            System.out.println("Sleep!!");
        }
        void eat() {
            System.out.println("Eat!!");
        }
    }


