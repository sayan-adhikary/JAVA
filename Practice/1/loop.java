import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Table:- ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int number = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
