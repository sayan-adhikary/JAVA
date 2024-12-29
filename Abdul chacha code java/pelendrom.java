
import java.util.Scanner;

    public class pelendrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt(),m=n,reverce=0,r;
        while (n>0) {
            r=n%10;
            n=n/10;
            reverce=reverce*10+r;
        }
        if (m==reverce) {
            System.out.println("Pelendrom");
            
        }        
        else{
            System.out.println("Not palendrom");
        }
    }
}


