import java.util.Scanner;

public class loopAtoB {
    public static String sum(int n){
        if(n % 2 == 0 &&  n > 2){
            return "Yes";
        }
        return "NO";
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        }
    }