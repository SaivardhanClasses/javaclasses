package OOPS.Multithreading;

public class DemoThread  implements Runnable{
    @Override
    public void  run() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DemoThread t1=new DemoThread();//1 to 10
        DemoThread t2=new DemoThread();
        Thread mt1=new Thread(t1);
        Thread mt2=new Thread(t2);
        mt1.start();
        mt2.start();


    }
}
