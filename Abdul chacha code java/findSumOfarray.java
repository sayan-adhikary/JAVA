import java.util.*;
public class findSumOfarray {
    public static void main(String[] args) {
        int A[]={4,3,14,5,6,7,8,9,11};
        int sum=0;
        for (int i=0;i<A.length;i++) {
            sum=sum+A[i];
            sum++;
            }
            System.out.println(sum);
        }
    }
