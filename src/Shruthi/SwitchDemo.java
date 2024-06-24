package Shruthi;

public class SwitchDemo {
    public static void main(String[] args) {
        String  ch="Monday";
        switch (ch){
            case "monday":
                System.out.println("it is monday");
                break;
            case "Monday":
                System.out.println("it is monday 2");
                break;
            default:
                System.out.println("it is default");

        }
    }
}
