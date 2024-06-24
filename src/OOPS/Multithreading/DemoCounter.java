package OOPS.Multithreading;

public class DemoCounter  extends Thread{
    Counter c=new Counter();
    @Override
    public void run() {
        Counter c=new Counter();
        for(int i=1;i<=1000;i++){
            c.increment();

        }
        System.out.println("count = "+c.count);
    }

    public static void main(String[] args) {

        DemoCounter d=new DemoCounter();
        d.start();


    }
}
