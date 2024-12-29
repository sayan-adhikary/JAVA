import java.util.*;
public class arithmatic {
    public static void main(String[] args) {
        // int a=15;
        // int b=2;
        // int c=a/b;
        // int d=a%b;
        // System.out.println(c);
        // System.out.println(c);
        // System.out.println(10/(2*5));
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        double r1,r2;
         a = sc.nextFloat();
         b = sc.nextFloat();
         c = sc.nextFloat();
         
         r1 = (-b-Math.sqrt(b*b-4*a*c))/(2*b);
         r2 = (-b+Math.sqrt(b*b-4*a*c))/(2*b);
        System.out.println(r1);
        System.out.println(r2);
        
    }
    
}
