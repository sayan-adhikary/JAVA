import java.util.*;
public class switchbutton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1:System.out.println("Sayan");
            break;
            case 2: System.out.println("papu");
            break;
            case 3: System.out.println("Madon");
            break;
            case 4: System.out.println("Dada");
            break;
            default: System.out.println("Invalid");
        }
    }
    
}
