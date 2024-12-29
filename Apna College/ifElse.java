import java.util.*;
public class ifElse {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n ");
    int n = sc.nextInt();
    System.out.print("m ");
    int m = sc.nextInt();
    if(n==m){
        System.out.println("n=m");
    }
    else{
    if(n>m){
        System.out.println("n greater");
    }
    else {
        System.out.println("n lesser");
    }
}
}
    
}
