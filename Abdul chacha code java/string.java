import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       str=str.replaceAll("\\s+", " ").trim();
       String words[]=str.split("\\s");
       System.out.print(words.length);
    }
    
}
