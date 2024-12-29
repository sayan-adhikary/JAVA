import java.util.*;

public class pyramid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int space=n-i;  //printing space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            int star=2*i-1; //printing star
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
            
            
        
    