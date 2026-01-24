import java.util.*;

public class Main {
    public static void capitalize(String n) {
        int length = n.length();
        // for(int i = 0; i < length; i++){

        // }
        char firstLetter = n.charAt(0);
        if (Character.isLowerCase(firstLetter)) {
            System.out.println(Character.toUpperCase(n.charAt(0)) + n.substring(1));
        } else {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine(); // ApPLe
        capitalize(n);
    }
}