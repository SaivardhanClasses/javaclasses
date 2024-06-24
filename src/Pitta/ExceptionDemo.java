package Pitta;

import javax.xml.bind.SchemaOutputResolver;

public class ExceptionDemo {
    public static void main(String[] args)  {

        try {
            int a=10;
            int b=20;
            int c=b/a;//you
            Class.forName("Pitta");
        }
        catch(ArithmeticException arthimetic){
            System.out.println(arthimetic);
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
        finally{
            System.out.println("finally block executed");
        }





    }
}
