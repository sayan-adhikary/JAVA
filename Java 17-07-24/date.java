import java.util.*;
public class date {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String d="01/12/2000";
        System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
