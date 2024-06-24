package OOPS.Multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        Test t=new Test();
        t.displayDetails();
    }
}
class Test{
    public void displayDetails(){
        Directions north = Directions.NORTH;
        System.out.println(north);

    }
}

