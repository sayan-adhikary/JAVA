import java.util.*;
public class searchElementInArray {
    public static void main(String[] args) {
        int A[]={4,3,14,5,6,7,8,9,11};
        int n=8;
        for (int i=0;i<=A.length;i++) {
            if (A[i]==n) {
                System.out.println("Index is "+i);
                System.exit(0);
            }
            
        }
        System.out.println("Not found");
    }
    
}