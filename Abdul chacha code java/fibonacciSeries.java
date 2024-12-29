import java.util.*;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        System.out.print("Enter the number: ");
        int k=sc.nextInt();
        int c;
        for (int i = 0; i < k; i++) {
            System.out.print(a+",");
            c=a+b;
            a=b;
            b=c;
            
        }

    }
}
