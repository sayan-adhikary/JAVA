import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int m=n;
        int r;
        int count=0;
        while (n>0) {
            r=n%10;
            n=n/10;
            count=count+r*r*r;
            }
            System.out.println(count);
            if(m==count){
                System.out.println("Aramstrong Number");
            }
            else{
                System.out.println("Not an Aramstrong Number");        
    }
}
}


