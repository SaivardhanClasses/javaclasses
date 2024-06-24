package OOPS;

public class Test extends  Abstract{

//the class which implementing the abstract class with abstract methods then this class is known as Concrete class.
//we can create object for concrete class but we cannot create a object for abstract class.
    @Override
    public void sound() {
        System.out.println("sound method calls");

    }
    public int findsum(){
        Integer a=20;
        int b=30;
        int c =a+b;

        return c;
    }

    @Override
    public void add(int a, int b) {
        int c =a+b;
        System.out.println("sum is"+c);
    }
}
