import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        for(int j=0;j<size;j++){
            if(number[j]==x){
                System.out.println("Found x in "+ j + " position");
            }
        }
    }
    
}
