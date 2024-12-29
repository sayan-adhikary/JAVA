import java.util.Scanner;

public class reverce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt(),reverce=0,r;
        while (n>0) {
            r=n%10;
            n=n/10;
            reverce=reverce*10+r;
        }
        System.out.println(reverce);
        
    }
}
