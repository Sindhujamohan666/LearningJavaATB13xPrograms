package ex_21_OOPS_Inheritance.Hybrid;

public class Lab186_Hybrid {
    public static void main(String[] args) {

    }
}
/*This causes Diamond problem
         gf
       f     m
          s */
class GF{}

class Father extends GF{}
class Mother extends GF{}
// class Son extends Mother, Father{}
