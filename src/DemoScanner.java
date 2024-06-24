import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        System.out.println("enter a name");
        String s= sc.next();
        System.out.println("enter  the money=");
        double d=sc.nextDouble();
        System.out.println("Given number is:"+n);
        System.out.println("Given name is: "+s);
        System.out.println("Given double is: "+d);

    }
}
