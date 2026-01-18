import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean foundEven = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                System.out.print(x + " ");
                foundEven = true;
            }
        }
        if (!foundEven) {
            System.out.print("-1");
        }
    }
}