import java.util.*;
public class updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper=sc.nextInt(); //ope=1 -> : set oper=0: clear
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;
        if(oper==1){
            int newNumber=bitMask|n;
            System.out.println(newNumber);
        } else{
            int newBitMask=~(bitMask);
            int newNumber= newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
