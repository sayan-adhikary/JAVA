import java.util.*;
public class largest {
    static void largestNumber(int[] arr){
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest ){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,5,7};
        largestNumber(arr);
    }
}
