import java.util.*;
public class str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.substring(str.lastIndexOf("."));
        System.out.println(str);
    }
    
}
