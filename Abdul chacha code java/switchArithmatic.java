import java.util.*;
public class switchArithmatic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option In Word");
        String a=sc.nextLine();
        a=a.toUpperCase();
        switch (a) {
                case "ADD":System.out.println(n+m);
                
                break;
                case "SUB":System.out.println(m-n);
                
                break;
                case "MUL":System.out.println(n*m);
                
                break;
                case "DIV":System.out.println(n/m);
                
                break;
                default:System.out.println("INVALID");
                break;
        }
        // switch (a) {
        //     case 1:
        //         System.out.println(n+m);
        //         break;
        //     case 2:
        //         System.out.println(n-m);
        //         break;
        //     case 3:
        //         System.out.println(n*m);
        //         break;
        //     case 4:
        //         System.out.println(n/m);
        //         break;
        
        //     default:System.out.println("Invalid");
        //         break;
        // }
    }
}
