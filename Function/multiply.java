import java.util.*;
public class multiply {
    public static int calculateMultiply(int a,int b) {
    return a * b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //int result = calculateMultiply(a, b);
        System.out.println(calculateMultiply(a, b)/*result */);

    }
    
}
