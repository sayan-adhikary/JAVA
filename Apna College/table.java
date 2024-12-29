import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  
        System.out.print("Table of: ");
          int a = sc.nextInt(); 
          System.out.println("Tables of:- " + a);
        for (int i=1;i<=10;i++){
            System.out.println(a + " x " + i + " = " +a*i);
        }
    }
}
