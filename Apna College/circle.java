import java.util.*;
public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        double area = 2 * Math.PI* r;
        System.out.println("Area "+area);
    }
}
