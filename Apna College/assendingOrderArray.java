import java.util.*;

import java.util.Scanner;

public class assendingOrderArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        //for defined

        boolean isAscending = true;

        for(int i=0;i<numbers.length-1;i++){

            if(numbers[i]>numbers[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("The Array is Shorted");
        }
        else{
            System.out.println("The Array is not shorted");
        }
    }
    
}
