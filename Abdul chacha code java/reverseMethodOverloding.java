import java.util.Arrays;

public class reverseMethodOverloding {
    static int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }

    static int [] reverse(int A[]){
        int[] B=new int[A.length];
        for (int i = A.length-1;i>=0;i--) {
            B[i]=A[i];
        }
        return B;
    }
    public static void main(String[] args) {
        int[] A = {4, 5, 6, 9, 8, 7, 5}; // Corrected array declaration
       int reversedNumber = reverse(1234); // Example usage of the first reverse method
       System.out.println("Reversed number: " + reversedNumber);
       
       int[] reversedArray = reverse(A); // Usage of the array reversal method
       System.out.println("Reversed array: " + Arrays.toString(reversedArray)); // Print the array
   }
}
