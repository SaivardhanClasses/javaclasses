package OOPS.Polymorphism;

public class Addition {
    public void sum(int a,int b){
        int c=a+b;
        System.out.println("sum of two numbers is :"+c);
    }
    public void sum(int a,int b,int c){
        int d=a+b+c;
        System.out.println("sum of three numbers is :"+d);
    }
    public double sum(double a,double b){
        return a+b;
    }
    public void sum(){
        System.out.println("adding method called without parameters");
    }



}
