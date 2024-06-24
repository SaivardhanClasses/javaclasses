package OOPS.Class;

public class WrapperDemo {
    public static void main(String[] args) {
        int i=10;// here we or not creating any object the value will be deleted automatically after running the program
        Integer n=i; //auto boxing
        Integer f=20;
        int j=f;//auto unboxing
        System.out.println(n+"  "+j);
    }
}
