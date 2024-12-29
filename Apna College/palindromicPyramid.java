import java.util.*;
public class palindromicPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        //outer loop
        for(int i=1;i<=n;i++){

            //space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //1st half pyramid 
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            //2nd half pyramid
            for(int j=2;j<=i;j++){      //if we add "j=1" o/p:- will be proper palindromic pyramid
            System.out.print(j);
            }
        
        System.out.println();
    }
    
}
}