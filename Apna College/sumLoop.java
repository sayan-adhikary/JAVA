import java.util.*;
public class sumLoop {
    public static void main(String[] args) {
        //sum of n number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i = 1; i<=n;i++){
            sum=sum + i;
        }
        System.out.println("sum of n numbers: " + sum);
    }
}
