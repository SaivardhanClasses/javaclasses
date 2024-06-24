package OOPS.Synchronizeddemo;

public class Test {
    public static void main(String[] args) {
        School sch=new School();
        MyThread t1=new MyThread(sch,"Raj");
        MyThread t2=new MyThread(sch,"Anusha");
        t1.start();
        t2.start();
    }
}
