import java.util.*;
public class calculaterSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operation = sc.nextInt();
        switch(operation){
            case 1: System.out.println("Sum of two number is " + a+b);
            break;
            case 2: System.out.print("Difference Of two number is "); 
            System.out.println(a-b);
            break;
            case 3: System.out.println("Multiply of Two number is " + a*b);
            break;
            case 4: if(b ==0){
                System.out.println("Invalid Divition");
            }
                else {
                    System.out.println("Divition of two number is " + a/b);
                } 
                    break;
            case 5: if(b ==0){
                System.out.println("Invalid Divition");
            }
            else{
                System.out.println("Remaining part is "+ a%b);
            }
            break;
            default: System.out.println("Invalid Operation");

            }

        }

    }

    // Try using Float
