import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Year: ");
        int year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("NON Leap Year");
                }
                else
                {
                    System.out.println("Leap Year");
                }
            }
            else
            {
                System.out.println("Leap Year");
            }
        }
        else
        {
            System.out.println("Non Leap Year");
        }
    }
}

