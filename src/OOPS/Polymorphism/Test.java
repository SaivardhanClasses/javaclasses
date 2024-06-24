package OOPS.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Addition ad=new Addition();
        ad.sum(12,22);
        double s=ad.sum(22.0,32.45);
        System.out.println("sum of decimals is: "+s);
        ad.sum(32,45,55);
        ad.sum();
    }
}
