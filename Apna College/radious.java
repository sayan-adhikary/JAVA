import java.util.*;
public class radious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valu of r");
        double r = sc.nextDouble();
        double radious = 2*Math.PI*r;
        double area = Math.PI*Math.pow(r, 2);
        
        System.out.println("Circle info: ");
        System.out.println("r: " + r);
        System.out.println("Radious: " + radious);
        System.out.println("Area "+ area);


    }
}
