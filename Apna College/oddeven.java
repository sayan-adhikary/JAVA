import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value ");
        int n=sc.nextInt();
        if(n % 2==1){
            System.out.println("odd");
        }
        else{
            System.out.println("Even");

        }
    }
}
