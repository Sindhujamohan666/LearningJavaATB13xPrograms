package ex_33_Generics;

public class Lab238_Generics_Class {
    public static void main(String[] args) {
        Genericclass g = new Genericclass(10);
        Genericclass g1 = new Genericclass("Pramod");
        Genericclass g2 = new Genericclass(true);
        Genericclass g3 = new Genericclass(3.14);
    }
}
class Genericclass<T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Genericclass(T data){  //parameterized constructor
      this.data=data;
    }
}