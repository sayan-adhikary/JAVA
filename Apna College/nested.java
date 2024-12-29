import java.util.*;
public class nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        for(int j=1;j<n;j++){
        for(int i=0;i<n;i++){
             System.out.print("*");
        }
        System.out.println(" ");
    }
}
    
}
