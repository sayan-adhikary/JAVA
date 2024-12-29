import java.util.*;
public class arithmaticProgress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int a=sc.nextInt();
        System.out.print("Enter the difference: ");
        int d=sc.nextInt();
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        int terms=a;
        for (int i = 0; i < n; i++) {
            System.out.print(terms+",");
            terms=d+terms;
        }
    }
}
