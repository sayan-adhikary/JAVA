import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read n and k
        int n = sc.nextInt();
        int k = sc.nextInt();

        int onTimeCount = 0;

        // Read arrival times
        for (int i = 0; i < n; i++) {
            int arrivalTime = sc.nextInt();
            if (arrivalTime <= 0) {
                onTimeCount++;
            }
        }

        // Check if class is canceled
        if (onTimeCount < k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
