import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter b number");
        int b=sc.nextInt();
        System.out.println("program executing");

            if(b==0) {
                throw new ArithmeticException("we can't divide by zero");

            }
            if(b>0){
                System.out.println(a/b);
            }



    }

}
