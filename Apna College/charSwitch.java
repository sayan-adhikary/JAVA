import java.util.*;
public class charSwitch {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        char button = sc.next().charAt(0);
        switch(button) {
            case 'a': System.out.println("Hellow");
            break;
            case 'b': System.out.println("namaste");
            break;
            case 'c': System.out.println("Bonjour");
            break;
            default : System.out.println("invalid Button");
        }
    }
    
}
